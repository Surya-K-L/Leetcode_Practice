class Solution {
    public int countPrimeSetBits(int left, int right) {
        int t=0;
        for(int i=left;i<=right;i++)
        {
            int p=Integer.bitCount(i);
            if(isPrime(p))
            {
                t++;
            }
        }
        return t;
    }
    public boolean isPrime(int n)
    {
        if(n<=1)   return false;
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)  return false;
        }
        return true;
    }
}
