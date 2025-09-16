class Solution {
    public int[] singleNumber(int[] nums) {
        int c=0;
        Arrays.sort(nums);
        ArrayList<Integer>al=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            c=1;
            while(i<nums.length-1 && nums[i]==nums[i+1])
            {
                c++;
                i++;
            }
            if(c==1)
            {
                al.add(nums[i]);
            }
        }
        int arr[]=new int[al.size()];
        for(int i=0;i<al.size();i++)
        {
            arr[i]=al.get(i);
        }
        return arr;
    }
}
