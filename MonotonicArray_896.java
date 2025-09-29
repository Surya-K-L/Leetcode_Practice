class Solution {
    public boolean isMonotonic(int[] nums) {
        int p[]=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            p[i]=nums[i];
        }
        Arrays.sort(nums);
        if(Arrays.equals(nums,p))
        { 
            return true;
        }
        else
        {
            int l=p.length-1;
            for(int i=0;i<p.length;i++)
            {
                if(p[l]!=nums[i])
                    return false;
                l--;
            }
        }
        return true;
    }
}
