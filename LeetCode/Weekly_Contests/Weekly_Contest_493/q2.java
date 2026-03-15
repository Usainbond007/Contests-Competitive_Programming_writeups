class Solution {
    public long countCommas(long n)
    {
      if (n<1000) 
            return 0;

        else if (n<=999999) 
            return n - 999;

        long sum = 0;
        long check = 1000;
        while (check <= n) {
            sum += n - check + 1;
            check*= 1000;
        }

        return sum;
    }
}
//https://leetcode.com/problems/count-commas-in-range-ii/description/
//APPROACH-A COMMA APPEARS IN EVERY 1000, SO WE ACCOUNT FOR THAT TILL 10^15
