class Solution {
    public int addDigits(int num) {
        int sum=0;
        while(num>9)
        {
            sum=0;
            while(num>0)
            {
                int t=num%10;
                sum+=t;
                num/=10;
            }
            num=sum;
        }
        return num;
    }
}
