class Solution {
    public boolean isFascinating(int n) {
        int n1=2*n;
        int n2=3*n;
        String p=""+n+""+n1+""+n2;
        int a[]=new int[10];
        for(int i=0;i<p.length();i++)
        {
            int t=p.charAt(i)-'0';
            a[t]++;
        }
        System.out.print(Arrays.toString(a));
        for(int i=0;i<10;i++)
        {
            if(i==0 && a[i]>0)
                return false;
            else if(i!=0 && a[i]!=1)
                return false;
        }
        return true;
    }
}
