class Solution {
    public int getLucky(String s, int k) {
        int op=k;
        int sum=0;
        while(true)
        {
            String p="";
            for(int i=0;i<s.length();i++)
            {
                int t=s.charAt(i)-'a';
                t=t+1;
                p=p+""+t;
            }
            sum=0;
            for(int i=0;i<p.length();i++)
            {
                sum+=Character.getNumericValue(p.charAt(i));
            }
            s="";
            s=s+""+sum;
            k-=1;
            if(op==1)
            {
                return sum;
            }
            break;
        }
        int tot=0;
        while(k>0)
        {
            tot=0;
            while(sum>0)
            {
                int m=sum%10;
                tot+=m;
                sum/=10;
            }
            sum=tot;
            k-=1;
        }
        return tot;
    }
}
