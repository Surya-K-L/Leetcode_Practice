class Solution {
    public String makeFancyString(String s) {
        String p="";
        int c=0;
        for(int i=0;i<s.length();i++)
        {
            c=1;
            while(i<s.length()-1 && s.charAt(i)==s.charAt(i+1))
            {
                c++;
                i++;
            }       
            String z=""+s.charAt(i);
            if(c>=3)
            {
                p=p+z.repeat(2);
            }
            else
            {
                p=p+z.repeat(c);
            }     
        }
        return p;
    }
}
