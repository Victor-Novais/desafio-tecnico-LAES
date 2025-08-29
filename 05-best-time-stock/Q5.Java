import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		int[] compras=new int[5];
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Digite os valores das acoes:");
		for(int i=0;i<compras.length;i++) {
			compras[i]=scan.nextInt();	
		}
		
		System.out.println(Acoes(compras));
		
	}
     
	public static int Acoes(int[] compras) {
		if (compras == null || compras.length<=0)return 0;
		int valormin=compras[0];
		int lucro=0;
		for (int i=1;i<compras.length;i++) {
			valormin=Math.min(valormin, compras[i]);
			lucro=Math.max(lucro,compras[i] - valormin );
		}
		return lucro;
	}
	

}
