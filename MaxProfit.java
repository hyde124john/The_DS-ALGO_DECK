class MaxProfit {
  // T.C - O(N), S.C - O(1)
    public int maxProfit(int[] prices) {
        int min = prices[0], profit = 0;
        for(int i = 0; i < prices.length; i ++){
            int cost = prices[i] - min;
            profit = Math.max(cost, profit);
            min = Math.min(min, prices[i]);
        }
        return profit;
    }
}
