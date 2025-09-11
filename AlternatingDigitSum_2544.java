class Solution {
    public int alternateDigitSum(int n) {
        int siz=(int)Math.log10(n)+1;
        String p=""+n;
        int tot=0;
        for(int i=0;i<siz;i++)
        {
            if(i%2==0)
            {
                tot+=Character.getNumericValue(p.charAt(i));
            }
            else
            {
                int z=Character.getNumericValue(p.charAt(i));
                z=-z;
                tot+=z;
            }
        }
        return tot;
    }
}
