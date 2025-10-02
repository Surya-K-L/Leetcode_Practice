class Solution {
    public int removeElement(int[] nums, int val) {
        int i=0,k=0,count=0;
        while(i<nums.length)
        {
            if(nums[i]!=val)
            {
                int p=nums[i];
                nums[i]=nums[k];
                nums[k]=p;
                k++;
                count++;
            }
            i++;
        }
        return count;
    }
}
