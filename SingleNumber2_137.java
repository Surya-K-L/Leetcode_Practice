class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int c=0;
        for(int i=0;i<nums.length;i++)
        {
            c=1;
            while(i<nums.length-1 && nums[i]==nums[i+1])
            {
                c++;
                i++;
            }
            if(c==1)
            {
                return nums[i];
            }
        }
        return -1;
    }
}
