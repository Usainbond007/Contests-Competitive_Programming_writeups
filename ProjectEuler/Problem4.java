
public class Problem4 {
    public static void main(String[] args) {
        int mx = 0;
        for (int i = 100; i <= 999; i++) {
            for (int j = 100; j <= 999; j++) {
                int p = i * j;
                if (pal(p) && p > mx)
                    mx = p;
            }
        }
        System.out.println(mx);
    }
    static boolean pal(int x) {
        int r = 0;
        int t = x;
        while (t > 0) {
            r= r*10+t%10;
            t/=10;
        }
        return r == x;
}}
