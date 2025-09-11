class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
        {
            return false;
        }
        else
        {
            int a[]=new int[26];
            for(int i=0;i<s.length();i++)
            {
                int p=s.charAt(i)-'a';
                a[p]++;
            }
            for(int i=0;i<t.length();i++)
            {
                int p=t.charAt(i)-'a';
                a[p]--;
            }
            for(int k:a)
            {
                if(k!=0)
                {
                    return false;
                }
            }
            return true;
        }
    }
}
