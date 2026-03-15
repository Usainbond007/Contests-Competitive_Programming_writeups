public class Problem10 {
    public static void main(String[] args) {
        int lim = 2000000;
        long s = 0;
        boolean[] p = new boolean[lim + 1];
        for (int i = 2; i <= lim; i++)
            p[i] = true;
        for (int i = 2; i * i <= lim; i++) {
            if (p[i]) {
                for (int j = i * i; j <= lim; j += i)
                    p[j] = false;
            }
        }
        for (int i = 2; i <= lim; i++)
            if (p[i])
                s += i;
        System.out.println(s);
    }
}
