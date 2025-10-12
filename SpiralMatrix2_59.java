class Solution {
    public int[][] generateMatrix(int n) {
        int a[][]=new int[n][n];
        int t=0,b=n-1,l=0,r=n-1;
        int c=1;
        if(n==0) return a;
        while(t<=b && l<=r)
        {
            for(int i=l;i<=r;i++)
            {
                a[t][i]=c;
                c++;
            }
            t++;
            for(int i=t;i<=b;i++)
            {
                a[i][r]=c;
                c++;
            }
            r--;
            if(t<=b)
            {
                for(int i=r;i>=l;i--)
                {
                    a[b][i]=c;
                    c++;
                }
            }
            b--;
            if(l<=r)
            {
                for(int i=b;i>=t;i--)
                {
                    a[i][l]=c;
                    c++;
                }
            }
            l++;
        }
        return a;
    }
}
