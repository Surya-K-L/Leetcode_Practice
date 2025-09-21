class Solution {
    public int findNumbers(int[] nums) {
        int c=0;
        for(int p:nums)
        {
            int t=(int)Math.log10(p)+1;
            if(t%2==0)
                c++;
        }
        return c;
    }
}
