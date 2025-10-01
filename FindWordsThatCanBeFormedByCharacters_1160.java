class Solution {
    public int countCharacters(String[] words, String chars) {
        int ch[]=new int[27];
        int totallen=0;
        for(int i=0;i<chars.length();i++)
        {
            int t=chars.charAt(i)-'a';
            ch[t]++;
        }
        for(int i=0;i<words.length;i++)
        {
            int arr[]=new int[27];
            for(int j=0;j<words[i].length();j++)
            {
                int z=words[i].charAt(j)-'a';
                arr[z]++;
            }
            int r=0;
            for(int j=0;j<words[i].length();j++)
            {
                int in=words[i].charAt(j)-'a';
                System.out.print(in);
                if(arr[in]<=ch[in])
                {
                    continue;
                }
                else
                {
                    r=1;
                }
            }
            if(r==0)
            {
                totallen+=words[i].length();
            }
        }
        return totallen;
    }
}
