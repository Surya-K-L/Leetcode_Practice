class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int c=0,max=0;
        for(int i=0;i<nums.length;i++)
        {
            c=1;
            while(i<nums.length-1 && nums[i]<nums[i+1])
            {
                c++;
                i++;
            }
            max=Math.max(c,max);
        }
        return max;
    }
}
