public class Problem2 {
    public static void main(String[] args) {
        int prev = 1, prev1 = 2;
        int sum = 0;
        while (prev1 <= 4000000) {
            if (prev1 % 2 == 0)
                sum += prev1;
            int c = prev+ prev1;
        prev = prev1;
            prev1= c;
        }
        System.out.println(sum);
    }
}
/*https://projecteuler.net/problem=2*/
