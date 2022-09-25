class Solution {
    public int maxProfit(int[] prices) {
        int result = 0;
        for (int i = 1; i < prices.length; i++) {
            int delta = prices[i] - prices[i - 1];
            result += delta > 0 ? delta : 0;
        }
        return result;
    }
}