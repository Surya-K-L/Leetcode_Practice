class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String p="",q="";
        for(String k:word1)
            p=p+k;
        for(String k:word2)
            q=q+k;
        return p.equals(q);
    }
}
