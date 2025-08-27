public class Exercicio05 {

    /**
     * Essa função compara os valores do array prices e retorna o maior lucro possivel,
     * comparando em ordem crescente de indice
     *
     * @param prices Array que será analizado
     * @return O dia do melhor momento para vender ações
     */
    public int lucroMaximo(int[] prices) {
        int precoCompra = prices[0];
        int lucroMaximo = 0;
        for (int i = 1; i < prices.length; i++) {
            /*
            Caso o valor da proxima posição do array seja menor que o preco de compra (Posição anterior), ele compara
            com o lucro máximo ja obtido para tentar encontrar o maior valor possivel. Se a condição não é satisfeita,
            o preçõ de compra se torna o valor seguinte e a comparação é refeita até todos os valores serem testados
             */
            if (prices[i] > precoCompra){
                lucroMaximo = Integer.max(prices[i] - precoCompra,lucroMaximo);
            } else {
                precoCompra = prices[i];
            }
        }
        return lucroMaximo;
    }
    
}
