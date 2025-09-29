class Solution {
    public int[][] transpose(int[][] matrix) {
        int rows=matrix.length;
        int col=matrix[0].length;
        int ans[][]=new int[col][rows];
        int r=0,c=0;
        for(int i=0;i<rows;i++)
        {
            r=0;
            for(int j=0;j<col;j++)
            {
                ans[r][c]=matrix[i][j];
                r++;
            }
            c++;
        }
        return ans;
    }
}
