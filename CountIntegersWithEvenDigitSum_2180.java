class Solution {
    public int countEven(int num) {
        int evendigits=0;
        for(int i=1;i<=num;i++)
        {
            int s=i;
            int tot=0;
            while(s>0)
            {
                int p=s%10;
                tot+=p;
                s/=10;
            }
            if(tot%2==0)
            {
                evendigits++;
            }
        }
        return evendigits;
    }
}
