import java.io.*;
import java.util.*;

public class Main {

InputStream is;
PrintWriter out;
String INPUT = "";

final long mod = 1000000007;
final int inf = (int)1e9;
final long linf = (long)1e18;

/* ===================== PAIR ===================== */

static class pair implements Comparable<pair>{
    long x,y;

    pair(long x,long y){
        this.x=x;
        this.y=y;
    }

    public int compareTo(pair p){
        if(x!=p.x) return Long.compare(x,p.x);
        return Long.compare(y,p.y);
    }

    public int hashCode(){
        return Objects.hash(x,y);
    }

    public boolean equals(Object o){
        if(!(o instanceof pair)) return false;
        pair p=(pair)o;
        return x==p.x && y==p.y;
    }

    public String toString(){
        return x+" "+y;
    }
}

/* ===================== DIRECTIONS ===================== */

int[] dx={0,0,1,-1};
int[] dy={1,-1,0,0};

int[] ddx={0,0,1,-1,1,-1,1,-1};
int[] ddy={1,-1,0,0,1,-1,-1,1};

/* ===================== SOLVE ===================== */

void solve() throws Exception{

}

/* ===================== MATH ===================== */

long gcd(long a,long b){
    return b==0?a:gcd(b,a%b);
}

long pow(long a,long b){
    long res=1;
    a%=mod;
    while(b>0){
        if((b&1)==1) res=(res*a)%mod;
        a=(a*a)%mod;
        b>>=1;
    }
    return res;
}

/* ===================== SHUFFLE ===================== */

void shuffle(int[] a){
    Random r=new Random();
    for(int i=0;i<a.length;i++){
        int j=r.nextInt(i+1);
        int t=a[i];
        a[i]=a[j];
        a[j]=t;
    }
}

/* ===================== DSU ===================== */

static class DSU{

    int[] parent,size;

    DSU(int n){
        parent=new int[n];
        size=new int[n];

        for(int i=0;i<n;i++){
            parent[i]=i;
            size[i]=1;
        }
    }

    int find(int x){
        if(parent[x]==x) return x;
        return parent[x]=find(parent[x]);
    }

    void union(int a,int b){
        a=find(a);
        b=find(b);

        if(a!=b){

            if(size[a]<size[b]){
                int t=a;a=b;b=t;
            }

            parent[b]=a;
            size[a]+=size[b];
        }
    }
}

/* ===================== FENWICK TREE ===================== */

static class Fenwick{

    int n;
    long[] tree;

    Fenwick(int n){
        this.n=n;
        tree=new long[n+1];
    }

    void update(int i,long val){
        for(i++;i<=n;i+=i&-i)
            tree[i]+=val;
    }

    long query(int i){
        long s=0;
        for(i++;i>0;i-=i&-i)
            s+=tree[i];
        return s;
    }

    long range(int l,int r){
        return query(r)-query(l-1);
    }
}

/* ===================== SEGMENT TREE ===================== */

static class SegTree{

    int n;
    long[] tree;

    SegTree(int n){
        this.n=n;
        tree=new long[4*n];
    }

    void build(int node,int l,int r,int[] arr){

        if(l==r){
            tree[node]=arr[l];
            return;
        }

        int mid=(l+r)/2;

        build(node*2,l,mid,arr);
        build(node*2+1,mid+1,r,arr);

        tree[node]=tree[node*2]+tree[node*2+1];
    }

    void update(int node,int l,int r,int idx,int val){

        if(l==r){
            tree[node]=val;
            return;
        }

        int mid=(l+r)/2;

        if(idx<=mid)
            update(node*2,l,mid,idx,val);
        else
            update(node*2+1,mid+1,r,idx,val);

        tree[node]=tree[node*2]+tree[node*2+1];
    }

    long query(int node,int l,int r,int ql,int qr){

        if(qr<l || ql>r)
            return 0;

        if(ql<=l && r<=qr)
            return tree[node];

        int mid=(l+r)/2;

        return query(node*2,l,mid,ql,qr)
        +query(node*2+1,mid+1,r,ql,qr);
    }
}

/* ===================== SIEVE ===================== */

boolean[] sieve(int n){

    boolean[] prime=new boolean[n+1];
    Arrays.fill(prime,true);

    prime[0]=prime[1]=false;

    for(int i=2;i*i<=n;i++){

        if(prime[i]){

            for(int j=i*i;j<=n;j+=i)
                prime[j]=false;
        }
    }

    return prime;
}

/* ===================== GRAPH BUILDER ===================== */

int[][] ng(int n,int e,int[] from,int[] to,boolean undirected){

    int[][] g=new int[n+1][];
    int[] cnt=new int[n+1];

    for(int i=0;i<e;i++){
        cnt[from[i]]++;
        if(undirected) cnt[to[i]]++;
    }

    for(int i=0;i<=n;i++)
        g[i]=new int[cnt[i]];

    for(int i=0;i<e;i++){

        g[from[i]][--cnt[from[i]]]=to[i];

        if(undirected)
            g[to[i]][--cnt[to[i]]]=from[i];
    }

    return g;
}

/* ===================== RUN ===================== */

void run() throws Exception{

    is=INPUT.isEmpty()?System.in:new ByteArrayInputStream(INPUT.getBytes());
    out=new PrintWriter(System.out);

    solve();
    out.flush();
}

/* ===================== MAIN ===================== */

public static void main(String[] args) throws Exception{

    boolean memory=false;

    if(memory)
        new Thread(null,()->{
            try{new Main().run();}
            catch(Exception e){e.printStackTrace();}
        },"1",1<<28).start();

    else
        new Main().run();
}

/* ===================== DEBUG ===================== */

void dbg(Object... o){
    System.err.println(Arrays.deepToString(o));
}

/* ===================== FAST INPUT ===================== */

private byte[] inbuf=new byte[1024];
public int lenbuf=0,ptrbuf=0;

private int readByte(){

    if(lenbuf==-1) throw new InputMismatchException();

    if(ptrbuf>=lenbuf){

        ptrbuf=0;

        try{
            lenbuf=is.read(inbuf);
        }catch(IOException e){
            throw new InputMismatchException();
        }

        if(lenbuf<=0) return -1;
    }

    return inbuf[ptrbuf++];
}

private boolean isSpaceChar(int c){
    return !(c>=33 && c<=126);
}

private int skip(){
    int b;
    while((b=readByte())!=-1 && isSpaceChar(b));
    return b;
}

private int ni(){

    int num=0,b;
    boolean minus=false;

    while((b=readByte())!=-1 && !((b>='0'&&b<='9')||b=='-'));

    if(b=='-'){
        minus=true;
        b=readByte();
    }

    while(true){

        if(b>='0'&&b<='9'){
            num=num*10+(b-'0');
        }else{
            return minus?-num:num;
        }

        b=readByte();
    }
}

private long nl(){

    long num=0;
    int b;
    boolean minus=false;

    while((b=readByte())!=-1 && !((b>='0'&&b<='9')||b=='-'));

    if(b=='-'){
        minus=true;
        b=readByte();
    }

    while(true){

        if(b>='0'&&b<='9'){
            num=num*10+(b-'0');
        }else{
            return minus?-num:num;
        }

        b=readByte();
    }
}

private String ns(){

    int b=skip();
    StringBuilder sb=new StringBuilder();

    while(!isSpaceChar(b)){
        sb.appendCodePoint(b);
        b=readByte();
    }

    return sb.toString();
}

private int[] na(int n){

    int[] a=new int[n];

    for(int i=0;i<n;i++)
        a[i]=ni();

    return a;
}

}
