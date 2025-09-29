class Solution {
    public int findComplement(int num) {
        if(num==0) return 1;
        int b=Integer.toBinaryString(num).length();
        int m=(1<<b)-1;
        return num^m;
    }
}
