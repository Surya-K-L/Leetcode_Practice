class Solution {
    public String finalString(String s) {
        String z="";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!='i')
            {
                z=z+s.charAt(i);
            }
            else
            {
                StringBuilder k=new StringBuilder(z);
                k.reverse();
                String p=k.toString();
                z=p;
            }
        }
        return z;
    }
}
