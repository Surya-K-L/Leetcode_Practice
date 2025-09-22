class Solution {
    public int findLucky(int[] arr) {
        int a[]=new int[501];
        for(int i=0;i<arr.length;i++)
        {
            a[arr[i]]++;
        }
        int max=-1;
        for(int i=1;i<501;i++)
        {
            if(i==a[i])
                max=i;
        }
        return max;
    }
}
