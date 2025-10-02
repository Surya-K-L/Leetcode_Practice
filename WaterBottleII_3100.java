class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int r=numBottles;
        int e=numBottles;
        while(e>=numExchange)
        {
            e-=numExchange;
            numExchange++;
            r++;
            e++;
        }
        return r;
    }
}
