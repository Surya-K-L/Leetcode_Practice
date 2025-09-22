class Solution {
    public boolean digitCount(String num) {
        int a[]=new int[10];
        for(int i=0;i<num.length();i++)
        {
            a[Character.getNumericValue(num.charAt(i))]++;
        }
        for(int i=0;i<num.length();i++)
        {
            if(a[i]!=Character.getNumericValue(num.charAt(i)))
            {
                System.out.println(a[i]);
                return false;
            }
        }
        return true;
    }
}
