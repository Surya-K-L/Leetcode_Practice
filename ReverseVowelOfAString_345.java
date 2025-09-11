class Solution {
    public String reverseVowels(String s) {
        char a[]=s.toCharArray();
        int i=0;
        int l=s.length()-1;
        while(i<l)
        {
            if((a[i]=='A'||a[i]=='E'||a[i]=='I'||a[i]=='O'||a[i]=='U'||a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u')) 
            {
                if((a[l]=='A'||a[l]=='E'||a[l]=='I'||a[l]=='O'||a[l]=='U'||a[l]=='a'||a[l]=='e'||a[l]=='i'||a[l]=='o'||a[l]=='u'))
                {
                    char p=a[i];
                    a[i]=a[l];
                    a[l]=p;
                    i++;
                    l--;
                }
                else
                {
                    l--;
                }
            }
            else
            {
                i++;
            }
        }
        String z="";
        for(int t=0;t<s.length();t++)
        {
            z=z+a[t];
        }
        return z;
    }
}
