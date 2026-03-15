class Solution {
    public String trimTrailingVowels(String s) 
    {
        //start from behind find the first consonant and then return the trailed
        int len=s.length();
        int index=-1;
        for(int i=len-1;i>=0;i--)
            {
                if(!vowel(s.charAt(i)))
                {
                    index=i;
                    break;
                }
            }
        if(index==-1)
            return "";
        return s.substring(0,index+1);
    }
  static boolean vowel(char c)
    {
        return ( c=='a'||c=='e'||c=='i'||c=='o'||c=='u');
    }

}
/*
https://leetcode.com/problems/trim-trailing-vowels/description/
*/
