class Solution {
    public int missingNumber(int[] nums) {
        int t=nums.length;
        int sum=(int)(t*(t+1))/2;
        int total=0;
        for(int i=0;i<nums.length;i++)
        {
            total+=nums[i];
        }
        return sum-total;
    }
}
