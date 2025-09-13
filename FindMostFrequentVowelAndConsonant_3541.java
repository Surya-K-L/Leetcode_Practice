class Solution {
    public int maxFreqSum(String s) {
        int a[]=new int[26];
        int total=0;
        for(int i=0;i<s.length();i++)
        {
            int t=s.charAt(i)-'a';
            a[t]++;
        }
        int vowmax=0;
        int conmax=0;
        for(int i=0;i<a.length;i++)
        {
            if(i==0||i==4||i==8||i==14||i==20)
            {
                if(vowmax<a[i])
                {
                    vowmax=a[i];
                }
            }
            else
            {
                if(conmax<a[i])
                {
                    conmax=a[i];
                }
            }
        }
        return conmax+vowmax;
    }
}
