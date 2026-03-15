import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {

            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());

            int[] a = new int[2 * n + 1];
            for (int i = 1; i <= 2 * n; i++)
                a[i] = Integer.parseInt(st.nextToken());

            int[] f = new int[n + 1];
            int[] pre = new int[2 * n + 1];
            boolean[] cut = new boolean[2 * n + 1];

            int p = 0;

            for (int i = 1; i <= 2 * n; i++) {

                pre[i - 1] = p;

                if (f[a[i]] == 0) {
                    f[a[i]] = i;
                } else {
                    int l = f[a[i]];
                    if ((p ^ pre[l - 1]) == 0) {
                        cut[i - 1] = true;
                        p ^= 1;
                    }
                }
            }

            ArrayList<Integer> ans = new ArrayList<>();

            for (int i = 1; i <= 2 * n - 1; i++)
                if (cut[i])
                    ans.add(i);

            sb.append(ans.size()).append("\n");
            for (int x : ans)
                sb.append(x).append(" ");
            sb.append("\n");
        }

        System.out.print(sb);
    }
}
/*
https://atcoder.jp/contests/arc215/tasks/arc215_b
*/
