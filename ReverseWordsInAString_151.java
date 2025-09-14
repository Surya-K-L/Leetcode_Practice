class Solution {
    public String reverseWords(String s) {
        s=s.replaceAll("\\s+"," ").trim();
        String p[]=s.split(" ");
        String k="";
        for(int i=p.length-1;i>=0;i--)
        {
            if(i!=0)
                k=k+""+p[i]+" ";
            else
                k=k+""+p[i];
        }
        return k;
    }
}
