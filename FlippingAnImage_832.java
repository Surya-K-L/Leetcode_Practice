class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n=image.length;
        for(int i=0;i<n;i++)
        {
            int t=n-1;
            for(int j=0;j<n/2;j++)
            {
                int k=image[i][j];
                image[i][j]=image[i][t];
                image[i][t]=k;
                t-=1;
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                image[i][j]=image[i][j]==0?1:0;
            }
        }
        return image;
    }
}
