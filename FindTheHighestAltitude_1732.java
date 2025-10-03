class Solution {
    public int largestAltitude(int[] gain) {
        int max=0,t=0;
        int a[]=new int[gain.length];
        for(int i=0;i<gain.length;i++)
        {
            if(i==0)
            {   
                if(a[i]>0)
                    a[i]=gain[i];
            }
            else
            {
                gain[i]=gain[i-1]+gain[i];
                max=max<gain[i]?gain[i]:max;
            }
        }
        for(int i=0;i<gain.length;i++)
        {
            if(max<gain[i])
            {
                max=gain[i];
            }
        }
        return max;
    }
}
