class Solution {
    public int countDigits(int num) {
        int k=num,c=0;
        while(num>0)
        {
            int t=num%10;
            if(k%t==0)
                c++;
            num/=10;
        }
        return c;
    }
}
