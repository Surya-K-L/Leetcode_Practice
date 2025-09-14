class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer>al=new ArrayList<>();
        char par[]=p.toCharArray();
        Arrays.sort(par);
        for(int i=0;i<s.length()-p.length()+1;i++)
        {
            String k=s.substring(i,i+p.length());
            char z[]=k.toCharArray();
            Arrays.sort(z);
            if(Arrays.equals(par,z))
            {
                al.add(i);
            }
        }
        return al;
    }
}
