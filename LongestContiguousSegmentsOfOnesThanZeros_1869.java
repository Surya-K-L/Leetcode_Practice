class Solution {
    public boolean checkZeroOnes(String s) {
        int z=0,zc=0;
        int o=0,oc=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='1')
            {
                oc++;
                zc=0;
                o=Math.max(o,oc);
            }
            else
            {
                zc++;
                oc=0;
                z=Math.max(z,zc);
            }
        }
        return o>z;
    }
}
