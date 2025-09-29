class Solution {
    public int sumOfSquares(int[] nums) {
        int t=0,k=nums.length,in=1;
        for(int i=0;i<nums.length;i++)
        {
            if(k%in==0)
            {
                int p=nums[i]*nums[i];
                t=t+p;
            }
            in++;
        }
        return t;
    }
}
