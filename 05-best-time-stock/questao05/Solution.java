package questao05;

class Solution {
    public int maxProfit(int[] prices) {
        int menor = prices[0];
        int lucro = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < menor) {
                menor = prices[i];
            } else if ((prices[i] - menor) > lucro) {
                lucro = prices[i] - menor;
            }
        }
        return lucro;
    }
}
