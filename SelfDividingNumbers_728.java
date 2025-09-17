class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer>al=new ArrayList<>();
        for(int i=left;i<=right;i++)
        {
            int t=i,z=i,fl=0;
            while(t>0)
            {
                if(t%10!=0)
                {
                    int p=t%10;
                    if(z%p!=0)
                    {
                        fl=1;
                        break;
                    }
                    t=t/10;
                }
                else
                {   
                    fl=1;
                    break;
                }
            }
            if(fl==0)
                al.add(i);
        }
        return al;
    }
}
