class Solution {
    public String restoreString(String s, int[] indices) {
        char a[]=new char[indices.length];
        for(int i=0;i<indices.length;i++)
        {
            a[indices[i]]=s.charAt(i);
        }
        String p=new String(a);
        return p;
    }
}
