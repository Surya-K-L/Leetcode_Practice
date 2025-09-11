class Solution {
    public String sortVowels(String z) {
        char s[]=z.toCharArray();
        ArrayList<Character>al=new ArrayList<>();
        for(int c=0;c<z.length();c++)
        {
            if(s[c]=='A'||s[c]=='E'||s[c]=='I'||s[c]=='O'||s[c]=='U'||s[c]=='a'||s[c]=='e'||s[c]=='i'||s[c]=='o'||s[c]=='u')
            {
                al.add(s[c]);
            }
        }
        System.out.println(al);
        Collections.sort(al);
        int ind=0;
        String p="";
        for(int c=0;c<z.length();c++)
        {
            if(s[c]=='A'||s[c]=='E'||s[c]=='I'||s[c]=='O'||s[c]=='U'||s[c]=='a'||s[c]=='e'||s[c]=='i'||s[c]=='o'||s[c]=='u')
            {
                char ar=al.get(ind);
                System.out.print(ar+"*");
                p=p+""+ar;
                ind++;
            }
            else
            {
                p=p+""+s[c];
            }
        }
        return p;
    }
}
