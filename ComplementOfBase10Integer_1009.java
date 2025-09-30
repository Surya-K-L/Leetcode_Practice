class Solution {
    public int bitwiseComplement(int n) {
        int t=Integer.toBinaryString(n).length();
        int m=(1<<t)-1;
        return m^n;
    }
}
