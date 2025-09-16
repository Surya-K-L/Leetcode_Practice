class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int max=0;
        for(int i=0;i<nums.length;i+=2)
        {
            int k=nums[i];
            int z=nums[i+1];
            max+=Math.min(k,z);
        }
        return max;
    }
}
