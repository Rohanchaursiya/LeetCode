class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        if(numBottles<numExchange){
            return numBottles;
        }
        int d=numBottles;
        int n;
        while(numBottles>=numExchange){
            n=numBottles/numExchange;
            d+=n;
            numBottles=n+(numBottles%numExchange);
        }
        return d;
    }
}