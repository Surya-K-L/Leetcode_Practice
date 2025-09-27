class Solution {
    public boolean squareIsWhite(String coordinates) {
        int t=coordinates.charAt(0)-97;
        int p=coordinates.charAt(1)-'0';
        if((t%2!=0 && p%2!=0) ||(t%2==0 && p%2==0))
        {
            return true;
        }
        return false;
    }
}
