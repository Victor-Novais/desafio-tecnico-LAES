public class BestTimeToBuyandSellStock {
    //Metodo para encontrar o melhor momento para comprar e vender ações
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;// Inicializa o preço mínimo com o maior valor possível
        int maxProfit = 0;// Inicializa o lucro máximo como 0
// Percorre a lista de preços
        for (int price : prices) {
            if (price < minPrice) {//se o preço atual for menor que o preço mínimo
                minPrice = price;//atualiza o preço mínimo
            } else if (price - minPrice > maxProfit) {//se o lucro atual for maior que o lucro máximo
                maxProfit = price - minPrice;//atualiza o lucro máximo
            }
        }
        return maxProfit;//retorna o lucro máximo
    }

}
