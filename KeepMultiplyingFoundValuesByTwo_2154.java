class Solution {
    public int findFinalValue(int[] nums, int original) {
        int p=0;
        while(true)
        {
            p=0;
            for(int i=0;i<nums.length;i++)
            {
                if(nums[i]==original)
                {
                    p=1;
                    original=nums[i]*2;
                    System.out.print(original);
                }
            }
            if(p==0)
            {
                break;
            }
        }
        return original;
    }
}
