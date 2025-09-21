class Solution {
    public int repeatedNTimes(int[] nums) {
        int max=-1;
        int len=nums.length/2;
        for(int n:nums)
        {
            if(max<n)
                max=n;
        }
        int a[]=new int[max+1];
        for(int n:nums)
        {
            a[n]++;
        }
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==len)
            {
                return i;
            }
        }
        return 0;
    }
}
