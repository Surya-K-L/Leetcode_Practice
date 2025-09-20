class Solution {
    public boolean isIsomorphic(String s, String t) {
        ArrayList<Character>al1=new ArrayList<>();
        ArrayList<Character>al2=new ArrayList<>();
        int sk=0;
        for(int i=0;i<s.length();i++)
        {
            if(!al1.contains(s.charAt(i)) && !al2.contains(t.charAt(i)))
            {
                al1.add(s.charAt(i));
                al2.add(t.charAt(i));
            }
            else
            {
                int k=al1.indexOf(s.charAt(i));
                if(k==-1)
                    return false;
                char m=al2.get(k);
                if(m!=t.charAt(i))
                {
                    return false;
                }
            }
        }
        // System.out.println(al1);
        // System.out.println(al2);
        return true;
    }
}
