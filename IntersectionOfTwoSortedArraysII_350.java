class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int n1[]=new int[1001];
        int n2[]=new int[1001];
        for(int i=0;i<nums1.length;i++)
        {
            n1[nums1[i]]++;
        }
        for(int i=0;i<nums2.length;i++)
        {
            n2[nums2[i]]++;
        }
        ArrayList<Integer>al=new ArrayList<>();
        for(int i=0;i<1001;i++)
        {
            if(n1[i]!=0 && n2[i]!=0)
            {
                int t=Math.min(n1[i],n2[i]);
                System.out.print(t+" ");
                al.addAll(Collections.nCopies(t,i));
            }
        }
        int p[]=new int[al.size()];
        for(int i=0;i<al.size();i++)
        {
            p[i]=al.get(i);
        }
        return p;
    }
}
