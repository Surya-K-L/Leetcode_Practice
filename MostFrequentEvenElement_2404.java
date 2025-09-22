class Solution {
    public int mostFrequentEven(int[] nums) {
        int max=-1,f=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2==0)
            {
                if(max<nums[i])
                {
                    f=1;
                    max=nums[i];
                }
            }
        }
        if(f==0)
            return -1;
        else
        {
            int a[]=new int[max+1];
            for(int i=0;i<nums.length;i++)
            {
                if(nums[i]%2==0)
                    a[nums[i]]++;
            }
            int ma=0;
            for(int i=0;i<a.length;i++)
            {
                if(ma<=a[i])
                {
                    ma=a[i];
                }
            }
            for(int i=0;i<a.length;i++)
            {
                if(ma==a[i])
                {
                    return i;
                }
            }
        }
        return -1;
    }
}
