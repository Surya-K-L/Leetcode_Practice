class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        String r="["+allowed+"]";
        int c=0;
        for(int i=0;i<words.length;i++)
        {
            String k=words[i];
            k=k.replaceAll(r,"");
            if(k.length()==0)
                c++;
        }
        return c;
    }
}
