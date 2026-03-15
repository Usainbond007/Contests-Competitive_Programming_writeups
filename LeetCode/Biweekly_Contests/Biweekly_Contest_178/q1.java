class Solution {
    public int firstUniqueEven(int[] nums)
    {
        HashMap<Integer,Integer> freq=new HashMap<>();
         for (int n : nums) 
         {
            freq.put(n, freq.getOrDefault(n, 0) + 1);
        }
        
        for(int i=0;i<nums.length;i++)
            {
                if(nums[i]%2==0&&(freq.get(nums[i])==1))
                    return nums[i];
            }
        return -1;
    }
}
//https://leetcode.com/problems/first-unique-even-element/
/*  Approach-use hashmap to store freq of all numbers, check if its evennumber and if its freq =1 return it
note-import hashmap as lc automatically does it I didnt do it
*/
