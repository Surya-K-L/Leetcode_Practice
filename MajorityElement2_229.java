class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer>al=new ArrayList<>();
        Arrays.sort(nums);
        int s=nums.length/3;
        int c=0;
        for(int i=0;i<nums.length;i++)
        {
            c=1;
            while(i<nums.length-1 && nums[i]==nums[i+1])
            {
                c++;
                i++;
            }
            if(c>s)
                al.add(nums[i]);
        }
        return al;
    }
}
