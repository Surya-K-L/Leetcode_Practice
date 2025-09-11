class Solution {
    public int differenceOfSum(int[] nums) {
        int elesum=0;
        int digisum=0;
        for(int i=0;i<nums.length;i++)
        {
            elesum+=nums[i];
            int z=nums[i];
            while(z>0)
            {
                int t=z%10;
                digisum+=t;
                z/=10;
            }
        }
        return elesum-digisum;
    }
}
