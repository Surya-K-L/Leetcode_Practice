class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int sol[]=new int[arr1.length];
        ArrayList<Integer>al=new ArrayList<>();
        for(int kl:arr2)
        {
            al.add(kl);
        }
        int max=-1;
        for(int i=0;i<arr1.length;i++)
        {
            if(max<arr1[i])
            {
                max=arr1[i];
            }
        }
        int t[]=new int[max+1];
        for(int i=0;i<arr1.length;i++)
        {
            t[arr1[i]]++;
        }
        int in=0;
        for(int i=0;i<arr2.length;i++)
        {
            int z=arr2[i];
            int coun=t[z];
            for(int j=0;j<coun;j++)
            {
                sol[in]=arr2[i];
                in++;
            }
        }
        for(int i=0;i<t.length;i++)
        {
            if(!al.contains(i))
            {
                int x=t[i];
                for(int j=0;j<x;j++)
                {
                    sol[in]=i;
                    in++;
                }
            }
        }
        return sol;
    }
}
