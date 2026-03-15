public class Problem9 {
    public static void main(String[] args) {

        for (int a = 1; a < 500; a++) {
            for (int b = 2; b < 500; b++) {
                int c = 1000 - a - b;
if(Math.pow(c, 2) == Math.pow(a, 2) + Math.pow(b, 2))  
{
    System.out.println(a * b * c);
                    return;
                }
            }
        }
    }
}
