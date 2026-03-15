class Solution {
    public String maximumXor(String s, String t) 
    {
       int one=0;
        int zero=0;
        for(char c:t.toCharArray())
            {
                if(c=='0')zero++;
                else
                  one++;
            }
        StringBuilder ans=new StringBuilder();
        for(char c:s.toCharArray())
            {
               if(c=='1')
               {
                   if(zero>0)
                   { ans.append('1');
                       zero--;
                   }
                   else
                   {
                       ans.append('0');
                   }
               }
                 if(c=='0')
               {
                   if(one>0)
                   {ans.append('1');
                       one--;
                   }
                   else
                   {ans.append('0');
                   }}}
        return ans.toString();
    }
}  /*
https://leetcode.com/problems/maximum-bitwise-xor-after-rearrangement/
*/
