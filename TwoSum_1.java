class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer>al=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int com=target-nums[i];
            if(al.containsKey(com))
            {
                return new int[]{al.get(com),i};
            }
            al.put(nums[i],i);
        }
        return new int[]{};
    }
}
