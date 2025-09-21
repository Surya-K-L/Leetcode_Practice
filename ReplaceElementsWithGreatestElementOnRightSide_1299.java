class Solution {
    public int[] replaceElements(int[] arr) {
        int in=-1;
        int max=0,f=0;
        for(int i=0;i<arr.length;i++)
        {
            max=0;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]>max)
                {
                    max=arr[j];
                    in=j;
                }
            }
            arr[i]=max;
        }
        arr[arr.length-1]=-1;
        return arr;
    }
}
