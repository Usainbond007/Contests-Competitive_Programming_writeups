public class Problem6 {
    public static void main(String[] args) {
        int n = 100;
        long s = 0;
        long sq = 0;
        for (int i = 1; i <= n; i++) {
            s += i;
            sq += i * i;
        }
        long res = s * s - sq;
        System.out.println(res);
}}
