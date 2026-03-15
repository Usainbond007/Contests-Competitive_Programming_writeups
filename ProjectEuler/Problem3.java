
public class Problem3 {
    public static void main(String[] args) {

        long n = 600851475143L;
        long factor = 2;
        while (factor * factor <= n) {
            if (n % factor == 0)
                n /= factor;
            else
                factor++;
        }
        System.out.println(n);
    }
}
