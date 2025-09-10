class Solution {
    public int singleNumber(int[] nums) {
        int s=0;
        for(int k:nums)
        {
            s=s^k;
        }
        return s;
    }
}
