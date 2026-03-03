class Solution {
    public int hammingDistance(int x, int y) {
        int c=x^y;
        int dig=0;
        int count=0;
        while(c>0)
        {
            dig=c%2;
            if(dig==1) count++;
            c=c/2;
        }
        return count;
    }
}
