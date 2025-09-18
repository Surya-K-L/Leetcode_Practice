class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int t=0,i=0;
        while(i<nums.length)
        {
            if(nums[i]%2==0)
            {
                int k=nums[i];
                nums[i]=nums[t];
                nums[t]=k;
                t++;
            }
            i++;
        }
        return nums;
    }
}
