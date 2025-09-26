class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int c=0,max=0,in=0;
        for(int i=0;i<mat.length;i++)
        {
            c=0;
            for(int j=0;j<mat[0].length;j++)
            {
                if(mat[i][j]==1)
                {
                    c++;
                }
            }
            if(max<c)
            {
                max=c;
                in=i;
            }
        }
        return new int[]{in,max};
    }
}
