class Solution {
    public int findMaxK(int[] nums) {
        int a[]=new int[1001];
        int b[]=new int[1001];
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>0)
            {
                if(a[nums[i]]==0)
                    a[nums[i]]++;
            }
            else 
            {
                int t=-nums[i];
                if(b[t]==0)
                    b[t]++;
            }
        }
        for(int i=1000;i>=0;i--)
        {
            if(a[i]>0 && b[i]>0 && a[i]==b[i])
                return i;
        }
        return -1;
    }
}
