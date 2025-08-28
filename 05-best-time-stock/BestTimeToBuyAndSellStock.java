public class BestTimeToBuyAndSellStock {
    public static int maxProfit(int[] prices){
        int minPrice = prices[0], lucro, maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            lucro = prices[i] - minPrice;
            if (minPrice > prices[i]) minPrice = prices[i];
            if (maxProfit < lucro) maxProfit = lucro;
        }
        return maxProfit;
    }
}
