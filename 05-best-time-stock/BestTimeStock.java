
public class BestTimeStock {

	public static void main(String[] args) {
		Integer resultado1 = bestTimeStock(new Integer[] {7,1,5,3,6,4});
		Integer resultado2 = bestTimeStock(new Integer[] {7,6,4,3,1});

		System.out.println(resultado1);
		System.out.println(resultado2);
	}

	public static Integer bestTimeStock(Integer[] prices) {
		Integer menorPreco = prices[0];
		Integer indexMenorPreco = 0;
		
		for (int i = 0; i < prices.length; i++) {
			if (prices[i] < menorPreco) {
				menorPreco = prices[i];
				indexMenorPreco = i;
			}			
		}
		
		Integer maiorPreco = menorPreco;
		for (int i = indexMenorPreco + 1; i < prices.length; i++) {
			if (prices[i] > maiorPreco) {
				maiorPreco = prices[i];
			}
		}
		
		if (indexMenorPreco + 1 == prices.length) {
			return 0;
		}
		
		return maiorPreco - menorPreco;
	}
}
