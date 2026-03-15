class Solution {
    public long gcdSum(int[] nums) 
    {
        //make a gcd fun
        //make an array prefixgcd
        int []pref=new int[nums.length];
        int max=nums[0];
        for(int i=0;i<nums.length;i++)
            {
                max=Math.max(nums[i],max);
                pref[i]=gcd(nums[i],max);
            }
        Arrays.sort(pref);
        long sum=0;
        int k=nums.length-1;
        for(int i=0;i<nums.length/2;i++)
            {
                sum+=gcd(pref[i],pref[k--]);
            }
        return sum;
    }
    public static int gcd(int a,int b)
  {
    while(b != 0)
    {
       int temp=b;
        b=a%b;
        a=temp;
    }
    return a;
}
}
/*
https://leetcode.com/problems/sum-of-gcd-of-formed-pairs/
very simple approach- bascially just simulated it not hard, use euler approach to compute gcd
*/
