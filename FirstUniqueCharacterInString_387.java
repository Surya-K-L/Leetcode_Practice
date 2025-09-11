class Solution {
    public int firstUniqChar(String s) {
        int a[]=new int[26];
        for(int i=0;i<s.length();i++)
        {
            int t=s.charAt(i)-'a';
            a[t]++;
        }
        for(int i=0;i<s.length();i++)
        {
            int t=s.charAt(i)-'a';
            if(a[t]==1)
            {
                return i;
            }
        }
        return -1;
    }
}
