class StockBuySell {
  //GFG problem Doesnt work for leetcode
    int stockBuySell(int prices[]) {
        // code here
        int n = prices.length;
        int maxProfit = 0;

        for (int i = 1; i < n; i++) {
            if (prices[i] > prices[i - 1]) {
                maxProfit += prices[i] - prices[i - 1];
            }
        }

        return maxProfit;
    }
}
