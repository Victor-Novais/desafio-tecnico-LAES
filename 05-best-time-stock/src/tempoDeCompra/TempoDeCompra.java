package tempoDeCompra;

public class TempoDeCompra {

	public static int maiorLucro(int[] a) {int venda; int lucroMaximo=0;
	for(int i = 0; i<a.length-1;i++) {
		
		for(int j = i+1; j<a.length; j++) {
			
			venda = a[j]-a[i];
			if(venda>lucroMaximo) {lucroMaximo = venda;}
		}
	}
	return lucroMaximo;
	}
}
