class Solution {
    public int countSeniors(String[] details) {
        int c=0;
        for(int i=0;i<details.length;i++)
        {
            String p=details[i].substring(11,13);
            int k=Integer.parseInt(p);
            if(k>60)
            {
                c++;
            }
        }
        return c;
    }
}
