class Solution {
    public boolean isPerfectSquare(int num) {
       int l=1,r=num;
       while(l<=r)
       {
            int mid=(r+l)/2;
            long mids=(long)mid*mid;
            if(mids==num) return true;
            else if(mids>num)
            {
                r=mid-1;
            }
            else
            {
                l=mid+1;
            }
       }
       return false;
    }
}
