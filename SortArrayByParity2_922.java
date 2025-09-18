class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int eve=0,odd=1;
        while(eve<nums.length && odd<nums.length)
        {
            if(nums[eve]%2==1)
            {
                int t=nums[eve];
                nums[eve]=nums[odd];
                nums[odd]=t;
                odd+=2;
            }
            else
            {
                eve+=2;
            }
        }
        return nums;
    }
}
