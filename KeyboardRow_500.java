class Solution {
    public String[] findWords(String[] words) {
        ArrayList<String>al=new ArrayList<>();
        for(int i=0;i<words.length;i++)
        {
            String q=words[i],w=words[i];
            String a=words[i],s=words[i];
            String z=words[i],x=words[i];
            q=q.replaceAll("[qwertyuiop QWERTYUIOP]","");
            if(q.length()==0)
            {
                al.add(w);
            }
            a=a.replaceAll("[asdfghjkl ASDFGHJKL]","");
            if(a.length()==0)
            {
                al.add(s);
            }
            z=z.replaceAll("[zxcvbnm ZXCVBNM]","");
            if(z.length()==0)
            {
                al.add(x);
            }
        }
            String arr[]=new String[al.size()];
            for(int i=0;i<al.size();i++)
            {
                arr[i]=al.get(i);
            }
            return arr;
    }
}
