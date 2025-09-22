class Solution {
    public int sumOfUnique(int[] nums) {
        int a[]=new int[101];
        for(int i=0;i<nums.length;i++)
        {
            a[nums[i]]++;
        }
        int t=0;
        for(int i=0;i<101;i++)
        {
            if(a[i]==1)
            {
                t+=i;
            }
        }
        return t;
    }
}
