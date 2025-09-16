class Solution {
    public int singleNonDuplicate(int[] nums) {
        int z=0;
        for(int k:nums)
        {
            z=z^k;
        }
        return z;
    }
}
