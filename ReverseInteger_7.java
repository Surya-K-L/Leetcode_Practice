class Solution {
    public int reverse(int x) {
        int t=Math.abs(x);
        long p=0;
        while(t>0)
        {
            int k=t%10;
            p=p*10+k;
            t/=10;
            if(p<Integer.MIN_VALUE||p>Integer.MAX_VALUE)
                return 0;
        }
        if(x>0)
        {
            return (int)p;
        }
        else
        {
            return (int)-p;
        }
    }
}
