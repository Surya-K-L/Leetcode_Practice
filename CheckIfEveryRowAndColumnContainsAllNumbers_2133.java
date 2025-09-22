class Solution {
    public boolean checkValid(int[][] matrix) {
        for(int i=0;i<matrix.length;i++)
        {
            int arr[]=new int[matrix.length+1];
            for(int j=0;j<matrix.length;j++)
            {
                int t=matrix[i][j];
                arr[t]++;
            }
            for(int j=1;j<=matrix.length;j++)
            {
                if(arr[j]==0)
                    return false;
            }
            int arb[]=new int[matrix.length+1];
            for(int j=0;j<matrix.length;j++)
            {
                int t=matrix[j][i];
                arb[t]++;
            }
            for(int j=1;j<=matrix.length;j++)
            {
                if(arb[j]==0)
                    return false;
            }
        }
        return true;
    }
}
