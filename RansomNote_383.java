class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int a[]=new int[26];
        int b[]=new int[26];
        for(int i=0;i<ransomNote.length();i++)
        {
            int t=ransomNote.charAt(i)-'a';
            a[t]++;
        }
        for(int i=0;i<magazine.length();i++)
        {
            int t=magazine.charAt(i)-'a';
            b[t]++;
        }
        for(int i=0;i<ransomNote.length();i++)
        {
            int t=ransomNote.charAt(i)-'a';
            if(b[t]<a[t])
                return false;
        }
        return true;
        
    }
}
