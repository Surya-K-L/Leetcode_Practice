class Solution {
    public int countSegments(String s) {
        s=s.replaceAll("\\s+"," ").trim();
        if(s.equals(""))
            return 0;
        else
        {
            String z[]=s.split(" ");
            return z.length;
        }
    }
}
