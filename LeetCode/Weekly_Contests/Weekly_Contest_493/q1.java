class Solution {
    public int countCommas(int n) 
    {
           if(n>=1000&&n<=9999)
        {
            int res=n-999;
             return  n-999;
        }
        else if(n>=10000&&n<=100000)
        {
                        int res=n-9999;
           return 9000+res;
        }
        else return 0;
        
    }
}
//Approach->simple n<=10^5, it was a simple soln in O(1) time, we need min of  4 digits for commas
//https://leetcode.com/problems/count-commas-in-range/
