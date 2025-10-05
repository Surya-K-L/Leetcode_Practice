class Solution {
    public boolean hasAlternatingBits(int n) {
        String p=Integer.toBinaryString(n);
        for(int i=0;i<p.length()-1;i++)
        {
            if(p.charAt(i)==p.charAt(i+1))
                return false;
        }
        return true;
    }
}
