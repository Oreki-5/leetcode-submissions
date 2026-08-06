
class Solution {
    public int maxProfit(int[] prices) {
        int output = 0;

        int buy = 0;
        int sell = 1;

        while (buy < prices.length && sell < prices.length) {
            if (prices[sell] - prices[buy] < 0) {
                buy = sell;
                sell = buy + 1;
            } else {
                System.out.println("Buy : " + prices[buy] + " Sell: " + prices[sell]);
                if (prices[sell] - prices[buy] > output) {
                    System.out.println("above is greater");
                    output = prices[sell] - prices[buy];
                    sell++;
                } else {
                    sell++;
                }

            }
        }

        return output;
    }
}