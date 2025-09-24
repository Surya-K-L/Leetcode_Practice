class Solution {
    public int titleToNumber(String columnTitle) {
        int tot=0;
        for(int i=0;i<columnTitle.length();i++)
        {
            char c=columnTitle.charAt(i);
            int t=c-'A'+1;
            tot=tot*26+t;
        }
        return tot;
    }
}
