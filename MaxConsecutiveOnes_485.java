class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int c=0,max=0,flag=0;
        if(nums.length==1 && nums[0]==1)
            return 1;
        else if(nums.length==1 && nums[0]==0)
            return 0;
        for(int i=0;i<nums.length;i++)
        {
            c=1;
            while(i<nums.length-1 && nums[i]==nums[i+1])
            {
                c++;
                i++;
            }
            if(nums[i]==1)
            {
                max=Math.max(c,max);
            }
        }
        return max;
    }
}
