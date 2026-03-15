class Solution {
    public long countSubarrays(int[] nums, int k, int m) 
    {
        //sliding window problem
        //so create a hashmap to store freq
        // if all the keys have value>=m its valid
        // and the value of keys(uniq)=k 
        HashMap<Integer,Integer> mp=new HashMap<>();

        int valid=0;
        int r=0;
        int l=0;
        long prefix=0;
        long count=0;
        int n=nums.length;
        while(r<n)
        {
            mp.put(nums[r],mp.getOrDefault(nums[r],0)+1);
            if(mp.get(nums[r])==m)
            valid++;

            // case when it exceeds k
            // case when eq to k
            // case when left has multiple more values
            while(mp.size()>k)
            {
                if(mp.get(nums[l])==m)
                valid--;
                mp.put(nums[l],mp.get(nums[l]) - 1);
                if(mp.get(nums[l])==0)
                mp.remove(nums[l]);
                l++;
                prefix=0;
            }
            if(mp.size()==k&&valid==k)
            {
                count++;
                while(mp.get(nums[l])>m)
                {
                    mp.put(nums[l],mp.get(nums[l])-1);

                    l++;
                    prefix++;
                }
                count+=prefix;
            }
            r++;
        }
return count;
    }
}
/*
https://leetcode.com/problems/count-subarrays-with-k-distinct-integers/
*/
