class Solution {
    public int arrangeCoins(int n) {
        int t=1,c=0;
        while(n>0)
        {
            n=n-t;
            if(n>=0)
            {
                c++;
            }
            t++;
        }
        return c;
    }
}
