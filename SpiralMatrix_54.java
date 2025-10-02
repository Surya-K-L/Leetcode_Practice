class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer>al=new ArrayList<>();
        int t=0,l=0,r=matrix[0].length-1,b=matrix.length-1;
        if(matrix==null||matrix.length==0) return al;
        while(l<=r && t<=b)
        {
            for(int i=l;i<=r;i++)
            {
                al.add(matrix[t][i]);
            }
            t++;
            for(int i=t;i<=b;i++)
            {
                al.add(matrix[i][r]);
            }
            r--;
            if(t<=b)
            {
                for(int i=r;i>=l;i--)
                {
                    al.add(matrix[b][i]);
                }
            }
            b--;
            if(l<=r)
            {
                for(int i=b;i>=t;i--)
                {
                    al.add(matrix[i][l]);
                }
            }
            l++;
        }
        return al;
    }
}
