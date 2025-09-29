class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>>sol=new ArrayList<>();
        Set<Integer>al1=new HashSet<>();
        Set<Integer>al2=new HashSet<>();
        for(int n:nums1)  al1.add(n);
        for(int n:nums2)  al2.add(n);

        ArrayList<Integer>pl1=new ArrayList<>();
        ArrayList<Integer>pl2=new ArrayList<>();

        for(int n:al1)
        {
            if(!al2.contains(n))
                pl1.add(n);
        }
        for(int n:al2)
        {
            if(!al1.contains(n))
                pl2.add(n);
        }
        sol.add(pl1);
        sol.add(pl2);
        return sol;
    }
}
