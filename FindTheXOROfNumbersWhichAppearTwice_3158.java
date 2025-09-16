class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        Arrays.sort(nums);
        int c=0;
        int flag=1;
        int z=0;
        for(int i=0;i<nums.length;i++)
        {
            c=1;
            while(i<nums.length-1 && nums[i]==nums[i+1])
            {
                c++;
                i++;
            }
            if(c==2)
            {
                flag=1;
                z=z^nums[i];
            }
        }
        if(flag!=0)
        {
            return z;
        }
        return 0;
    }
}
