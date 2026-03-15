public class Problem5 {
    public static void main(String[] args) {
        long num = 20;
        while (true) {
            boolean divisible = true;
            for (int i = 1; i <= 20; i++) {
                if (num % i != 0) {
                    divisible = false;
                    break;
                }}
            if (divisible) {
                System.out.println(num);
                break;
            }
            num += 20;
        }}}
