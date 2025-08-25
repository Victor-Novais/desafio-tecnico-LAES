

public class BuyAndSell {
    public static void main(String[] args) {
        int[] prices = { 7,6,4,3,1 };
        int min = prices[0];
        int lucro = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            } else if (prices[i] - min > lucro) {
                lucro = prices[i] - min;
            }
        }
        System.out.println(lucro);
    }
}