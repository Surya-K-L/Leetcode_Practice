class Solution {
    public boolean isHappy(int n) {
        ArrayList<Integer>al=new ArrayList<>();
        while(n!=1)
        {
            int k=0;
            while(n>0)
            {
                int t=n%10;
                int z=t*t;
                k=k+z;
                n/=10;
            }
            if(k==7)
                return true;
            if(k<10 && k!=1)
                return false;
            n=k;
        }
        return true;
    }
}
