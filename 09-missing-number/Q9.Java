import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Quantos numeros terá a ordem:");
		int n=scan.nextInt();
		int[] nums=new int[n];
		
		for (int i=0;i<n;i++) {
			nums[i]=scan.nextInt();
		}
		
		System.out.println(BuscaIntervalo(nums,n ));
	
	}
	
	public static int BuscaIntervalo(int[] nums, int n) {
		int soma1=0;
		int soma2=0;
		for (int i=0;i<n;i++) {
			soma1=soma1+nums[i];
		}
		if(nums[0]!=0) {
			for (int i=1;i<=n+1;i++) {
				soma2=soma2+i;
			}
		}else {
			for (int i=1;i<=n;i++) {
				soma2=soma2+i;
			}
		}
		
		
		int resultado=soma2-soma1;
		System.out.println(soma2);
		System.out.println(soma1);
		
		return resultado;
	}

}
