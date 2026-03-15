class Solution {
    public int scoreDifference(int[] nums) 
    {
        int score1=0;
        int score2=0;
        int flag=0;
        for(int i=0;i<nums.length;i++)
            {
                if(nums[i]%2!=0)
                {
                    flag=1-flag;
                }
            
                 if (i%6== 5) {
                    flag=1-flag;
                } 
            
              if (flag==0) {
                score1+=nums[i];
            } else {
                score2+=nums[i];
            }
        }
        return score1-score2;  
    }
}
/*
https://leetcode.com/problems/find-the-score-difference-in-a-game/
Basically toggle the flags depending on the scenario - for every 6th game swap inactive and active
and for odd nums[i] swap
then return score dif
*/
