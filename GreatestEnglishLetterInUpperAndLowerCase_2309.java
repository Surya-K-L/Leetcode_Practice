class Solution {
    public String greatestLetter(String s) {
        int a[]=new int[26];
        int b[]=new int[26];
        for(int i=0;i<s.length();i++)
        {
            if(Character.isLowerCase(s.charAt(i)))
            {
                int t=s.charAt(i)-'a';
                a[t]++;
            }
            else
            {
                int t=s.charAt(i)-'A';
                b[t]++;
            }
        }
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        for(int i=25;i>=0;i--)
        {
            if(a[i]>0 && b[i]>0)
            {
                char t=(char)(65+i);
                System.out.println(t);
                String z=""+Character.toUpperCase(t);
                return z;
            }
        }
        return "";
    }
}
