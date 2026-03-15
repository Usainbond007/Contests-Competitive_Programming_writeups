public class Problem7 {
    public static void main(String[] args) {
        int lim = 300000;
        boolean[] p = new boolean[lim + 1];
        for (int i = 2; i <= lim; i++)
            p[i] = true;
        for (int i = 2; i * i <= lim; i++) {
            if (p[i]) {
                for (int j = i * i; j <= lim; j += i)
                    p[j] = false;
            }
        }
        int c = 0;
        for (int i = 2; i <= lim; i++) {
            if (p[i]) {
                c++;
                if (c == 10001) {
                    System.out.println(i);
                    break;
                }}}}}
