import java.util.Scanner;

public class Q4 {
	
		public static void main(String[] args) {
			
			Scanner scan= new Scanner(System.in);
			System.out.println("Digite o numero de total que sera colocado:");
			int n=scan.nextInt();
			int[] nums=new int[n];
			System.out.println("digite os numeros:");
			for(int i=0; i<n;i++) {
			
			nums[i]=scan.nextInt();
			}
			
			
			System.out.println(ValorMax(nums));
			
		}
		
		public static int ValorMax(int[] nums) {
			if(nums.length==0)return 0;
			
			int maximo=nums[0];
			int minimo=Math.max(0, maximo);
			int resultado=nums[0];
			
			for ( int i=1;i<nums.length;i++) {
				minimo+=nums[i];
				maximo=Math.max(minimo,maximo);
				if(minimo<0)minimo=0;
				
			}
			return maximo;
		}
	
}
