class Solution {
    public boolean judgeCircle(String moves) {
        int u=0,d=0,r=0,l=0;
        for(int i=0;i<moves.length();i++)
        {
            if(moves.charAt(i)=='U')
            {
                u++;
            }
            else if(moves.charAt(i)=='L')
            {
                l++;
            }
            else if(moves.charAt(i)=='D')
            {
                d++;
            }
            else
            {
                r++;
            }
        }
        if(((u-d)==0) && ((r-l)==0))
            return true;
        return false;
    }
}
