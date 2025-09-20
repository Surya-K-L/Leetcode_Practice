class Solution {
    public int longestPalindrome(String s) {
        int tot=0;
        if(s.length()==1)
        {
            return 1;
        }
        else
        {
            char p[]=s.toCharArray();
            Arrays.sort(p);
            int c=0,f=0;
            for(int i=0;i<p.length;i++)
            {
                c=1;
                while(i<p.length-1 && p[i]==p[i+1])
                {
                    c++;
                    i++;
                }
                if(c%2==0)
                {
                    tot+=c;
                }
                else
                {
                    tot+=c-1;
                    f=1;
                }
            }
            if(f==1)
                return tot+1;
            return tot;
        }
    }
}
