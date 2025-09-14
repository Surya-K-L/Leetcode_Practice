class Solution {
    public String reverseWords(String s) {
        String z[]=s.split(" ");
        String output="";
        for(int i=0;i<z.length;i++)
        {
            StringBuilder k=new StringBuilder(z[i]);
            k.reverse();
            String l=k.toString();
            if(i!=z.length-1)
            {
                output=output+""+l+" ";
            }
            else
            {
                output=output+""+l;
            }
        }
        return output;
    }
}
