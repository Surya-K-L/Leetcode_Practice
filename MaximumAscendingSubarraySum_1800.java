class Solution {
    public int maxAscendingSum(int[] nums) {
        int c=0;
        int max=0;
        for(int i=0;i<nums.length;i++)
        {
            c=nums[i];
            while(i<nums.length-1 && nums[i]<nums[i+1])
            {
                i++;
                c+=nums[i];
            }
            max=max<c?c:max;
        }
        return max;
    }
}
