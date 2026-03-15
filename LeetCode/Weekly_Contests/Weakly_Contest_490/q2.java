class Solution {
    public boolean isDigitorialPermutation(int n) 
    {
        if(n<0)
        {
            n=n*-1;
        }
        int res=n;
        int sum=0;
        while(res>0)
            {
                int dig=res%10;
                sum+=factorial(dig);
                res=res/10;
            }
        return check(n,sum);
    }
    static boolean check(int res,int sum)
    {
        int[] freq = new int[10];
        
        while(res>0)
            {
                freq[res%10]++;
                res/=10;
            }
        while(sum>0)
            {
                freq[sum%10]--;
                sum/=10;
            }

        for(int f:freq)
            {
                if(f!=0)
                    return false;
            }
        return true;
    }
    static long factorial(int n)
    {
    long result = 1;
    for (int i = 2; i <= n; i++) {
        result *= i;
    }
    return result;
    }
}
/*
https://leetcode.com/problems/check-digitorial-permutation/
*/
