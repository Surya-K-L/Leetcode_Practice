class Solution {
    public int dominantIndex(int[] nums) {
        int max=0,ind=0;
        for(int i=0;i<nums.length;i++)
        {
            if(max<nums[i])
            {
                max=nums[i];
                ind=i;
            }
        }
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=max)
            {
                int k=nums[i]*2;
                if(k>max)
                {
                    return -1;
                }
            }
        }
        return ind;
    }
}
