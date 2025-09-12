class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int c=0;
        int min=0,ans=0;
        for(int i=0;i<nums.length;i++)
        {
            c=1;
            while(i<nums.length-1 && nums[i]==nums[i+1])
            {
                c++;
                i++;
            }
            if(min<c)
            {
                min=c;
                ans=nums[i];
            }
        }
        return ans;
    }
}
