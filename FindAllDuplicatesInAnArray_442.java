class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer>al=new ArrayList<>();
        int max=0;
        for(int c:nums)
        {
            if(max<c)
            {
                max=c;
            }
        }
        int a[]=new int[max+1];
        for(int z:nums)
        {
            a[z]++;
        }
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==2)
            {
                al.add(i);
            }
        }
        return al;
    }
}
