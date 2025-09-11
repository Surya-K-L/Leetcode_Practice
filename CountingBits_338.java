class Solution {
    public int[] countBits(int n) {
        int a[]=new int[n+1];
        for(int i=0;i<=n;i++)
        {
            int count=0;
            int t=i;
            while(t>0)
            {
                t=t&(t-1);
                count++;
            }
            a[i]=count;
        }
        return a;
    }
}
