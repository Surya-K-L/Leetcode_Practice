class Solution {
    public void sortColors(int[] nums) {
        int flag=0;
        for(int i=0;i<nums.length-1;i++)
        {
            for(int j=0;j<nums.length-1;j++)
            {
                if(nums[j]>nums[j+1])
                {
                    int t=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=t;
                }
            }
        }
    }
}
