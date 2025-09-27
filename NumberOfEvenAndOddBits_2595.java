class Solution {
    public int[] evenOddBit(int n) {
        int o=0;
        int e=0;
        String p=Integer.toBinaryString(n);
        int c=p.length();
        for(int i=0;i<c;i++)
        {
            if(p.charAt(i)=='1')
            {
                int a=p.length()-1-i;
                if(a%2==0)
                {
                    e++;
                }
                else
                {
                    o++;
                }
            }
        }
        return new int[]{e,o};
    }
}
