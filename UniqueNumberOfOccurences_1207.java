class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Arrays.sort(arr);
        int c=0;
        ArrayList<Integer>al=new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            c=1;
            while(i<arr.length-1 && arr[i]==arr[i+1])
            {
                c++;
                i++;
            }
            if(!al.contains(c))
            {
                al.add(c);
            }
            else
            {
                return false;
            }
        }
        return true;
    }
}
