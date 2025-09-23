class Solution {
    public int minNumber(int[] nums1, int[] nums2) {
        int a[]=new int[10];
        int b[]=new int[10];
        for(int i=0;i<nums1.length;i++)
        {
            a[nums1[i]]++;
        }
        for(int i=0;i<nums2.length;i++)
        {
            b[nums2[i]]++;
        }
        for(int i=1;i<10;i++)
        {
            if(a[i]>0 && b[i]>0 && a[i]==b[i])
            {
                return i;
            }
        }
        int min1=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;
        for(int i=0;i<nums1.length;i++)
        {
            if(min1>nums1[i])
            {
                min1=nums1[i];
            }
        }
        for(int i=0;i<nums2.length;i++)
        {
            if(min2>nums2[i])
            {
                min2=nums2[i];
            }
        }
        System.out.print(min1+" "+min2);
            if(min1<min2)
            {
                String z=""+min1+min2;
                return Integer.parseInt(z);
            }
            else
            {
                String z=""+min2+min1;
                return Integer.parseInt(z);
            }
    }
}
