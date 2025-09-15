class Solution {
    public String reverseOnlyLetters(String p) {
        ArrayList<Character>al=new ArrayList<>();
        String l="";
        for(int i=0;i<p.length();i++)
        {
            if((p.charAt(i)>='a'&& p.charAt(i)<='z') ||(p.charAt(i)>='A' && p.charAt(i)<='Z'))
            {
                al.add(p.charAt(i));
            }
        }
        int t=al.size()-1;
        for(int i=0;i<p.length();i++)
        {
            if((p.charAt(i)>='a'&& p.charAt(i)<='z') ||(p.charAt(i)>='A' && p.charAt(i)<='Z'))
            {
                l=l+al.get(t);
                t--;
            }
            else
            {
                l=l+p.charAt(i);
            }
        }
        return l;

    }
}
