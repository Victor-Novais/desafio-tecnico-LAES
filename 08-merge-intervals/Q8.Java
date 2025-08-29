import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q8 {
	
	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Digite a quantidade de intervalos:");
		int n=scan.nextInt();
		int[][] Intervalo=new int[n][2];
		
		System.out.println("Digite os numeros dos intervalos:");
		for(int i = 0;i<n;i++) {
			int inicio;
			int fim;
			
			System.out.print("Início:");
            inicio=scan.nextInt();

            System.out.print("Fim:");
            fim=scan.nextInt();
            
            Intervalo[i][0]=inicio;
            Intervalo[i][1]=fim;
		}
		
		int[][] juntos=margem(Intervalo);
		
		 for (int[] Intervalos : juntos) {
	            System.out.println(Arrays.toString(Intervalos));
	        }
		
	}
	
	public static int[][] margem (int[][] Intervalo){
		if(Intervalo==null || Intervalo.length==0) {
			return new int[0][0];
		}
		
		List<int[]> ListaIntervalos= new ArrayList<>();
		Arrays.sort(Intervalo, (a, b) -> a[0] - b[0]);
		
		for(int i=0;i<Intervalo.length;i++) {
			int min = Intervalo[i][0];
			int max = Intervalo[i][1];
			while(i+1<Intervalo.length && (Intervalo[i+1][0]<=max||Intervalo[i+1][1]<=max)) {
				max=Math.max(max, Intervalo[i+1][1]);
				i++;
			}
			ListaIntervalos.add(new int[] {min, max});
		}
		return ListaIntervalos.toArray(new int[0][1]);
		
	}

}

