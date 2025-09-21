class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer>al=new ArrayList<>();
        int a[]=new int[nums.length+1];
        for(int n:nums)
        {
            a[n]++;
        }
        for(int i=0;i<a.length;i++)
        {
            if(i!=0 && a[i]==0)
            {
                al.add(i);
            }
        }
        return al;
    }
}
