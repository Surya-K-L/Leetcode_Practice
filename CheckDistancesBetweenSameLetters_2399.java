class Solution {
    public boolean checkDistances(String s, int[] distance) {
        int in=0;
        for(char a='a';a<='z';a++)
        {
            String p=""+a;
            int k=s.indexOf(p);
            int e=s.lastIndexOf(p);
            int t=0;
            if(k!=-1 && e!=-1)
            {
                t=e-k-1;
                if(t!=distance[in])
                {
                    return false;
                }
            }
            in++;
        }
        return true;
    }
}
