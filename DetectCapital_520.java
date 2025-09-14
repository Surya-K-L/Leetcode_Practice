class Solution {
    public boolean detectCapitalUse(String word) {
        int up=0;
        int lo=0;
        for(int i=0;i<word.length();i++)
        {
            if(Character.isUpperCase(word.charAt(i)))
            {
                up++;
            }
            if(Character.isLowerCase(word.charAt(i)))
            {
                lo++;
            }
        }
        if(lo==word.length() || up==word.length())
            return true;
        else
        {
            if(Character.isUpperCase(word.charAt(0)) && (word.length()-1==lo))
            {
                return true;
            }
        }
        return false;
    }
}
