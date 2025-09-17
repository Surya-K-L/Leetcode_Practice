class Solution {
    public int maxPower(String s) {
        int  max=0,c=0;
        for(int i=0;i<s.length();i++)
        {
            c=1;
            while(i<s.length()-1 && s.charAt(i)==s.charAt(i+1))
            {
                c++;
                i++;
            }
            max=Math.max(c,max);
        }
        return max;
    }
}
