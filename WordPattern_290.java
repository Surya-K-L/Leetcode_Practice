class Solution {
    public boolean wordPattern(String pattern, String s) {
        ArrayList<Character>ch=new ArrayList<>();
        ArrayList<String>st=new ArrayList<>();
        String p[]=s.split(" ");
        if(p.length!=pattern.length())
            return false;
        for(int i=0;i<p.length;i++)
        {
            char z=pattern.charAt(i);
            if(!ch.contains(z) && !st.contains(p[i]))
            {
                st.add(p[i]);
                ch.add(z);
            }
            else
            {
                int ind=ch.indexOf(pattern.charAt(i));
                if(ind<0)
                {
                    return false;
                }
                else if(!p[i].equals(st.get(ind)))
                {
                    return false;
                }
            }
        }
        return true;
    }
}
