class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int total=numBottles,c=0;
        while(true)
        {
            int t=numBottles%numExchange;
            int p=numBottles/numExchange;
            total+=p;
            c=t;
            numBottles=p+c;
            if(numBottles<numExchange)
                break;
        }
        return total;
    }
}
