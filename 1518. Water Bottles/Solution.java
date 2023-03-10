class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int sum = numBottles;
        while(numBottles >= numExchange){
          int  ex = numBottles/numExchange;
            sum = sum + ex;
            numBottles = ex + (numBottles%numExchange);
        }
        return sum;
    }
}