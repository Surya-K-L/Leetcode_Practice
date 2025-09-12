class Solution {
    public boolean doesAliceWin(String s) {
        for(int i=0;i<s.length();i++)
        {
            char p=s.charAt(i);
            if(p=='a'||p=='e'||p=='i'||p=='o'||p=='u')
                return true;
        }
        return false;
    }
}
