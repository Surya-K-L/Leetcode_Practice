class Solution {
    public boolean containsDuplicate(int[] nums) {
        int c=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++)
        {
            c=1;
            while(i<nums.length-1 && nums[i]==nums[i+1])
            {
                i++;
                c++;
            }
            if(c>1)
            {
                return true;
            }
        }
        return false;
    }
}
