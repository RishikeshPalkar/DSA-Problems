class Solution {
    public int maxProfit(int[] prices) {
        
        int profit = 0;
        int buy = prices[0];
        for(int i : prices){
            if(buy > i){
                buy = i;
            }
            else {
                profit =Math.max( i-buy , profit);
            }
        }
        return profit;
    }
}