class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer>al=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            String p=""+nums[i];
            for(int j=0;j<p.length();j++)
            {
                al.add(Character.getNumericValue(p.charAt(j)));
            }
        }
        int arr[]=new int[al.size()];
        for(int i=0;i<al.size();i++)
            arr[i]=al.get(i);
        return arr;
    }
}
