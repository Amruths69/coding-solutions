//daily-dump
class Solution {
    public int maxProfit(int[] prices) {

        int buy1 = -prices[0];
        int sell1 = 0;

        int buy2 = -prices[0];
        int sell2 = 0;

        for (int price : prices) {

            // First transaction
            buy1 = Math.max(buy1, -price);
            sell1 = Math.max(sell1, buy1 + price);

            // Second transaction
            buy2 = Math.max(buy2, sell1 - price);
            sell2 = Math.max(sell2, buy2 + price);
        }

        return sell2;
    }
}
