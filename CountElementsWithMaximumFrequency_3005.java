class Solution {
    public int maxFrequencyElements(int[] nums) {
        int a[]=new int[101];
        if(nums.length==1)
            return 1;
        int total=0;
        for(int i=0;i<nums.length;i++)
        {
            a[nums[i]]++;
        }
        int max=0;
        for(int i=0;i<101;i++)
        {
            if(max<a[i])
            {
                max=a[i];
            }
        }
        System.out.print(max);
        for(int i=0;i<101;i++)
        {
            if(max==a[i])
            {
                total+=a[i];
            }
        }
        return total;
    }
}
