import java.util.Scanner;
import java.util.Map;
import java.util.Arrays;
import java.util.HashMap;

public class Q1 {

	 public static void main(String[] args) {
		int[] nums = new int[5];
		int target;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o numero do Target:");
		target=scan.nextInt();
		System.out.println("Digite os numeros do Arrays:");
		for(int i = 0;i<nums.length;i++) {
			
			nums[i]=scan.nextInt();
		}
		
		  int[] resultado = mapa(nums, target);
		  
		  if (resultado != null) {
	            System.out.println(Arrays.toString(resultado));
	        }


	}
	 
	 public static int[] mapa(int[] nums, int target) {
		 
		 Map<Integer,Integer> map = new HashMap<>();
		 
		 for (int i=0; i<nums.length;i++) {
			Integer mapcomplemento = map.get(nums[i]);
			 if (mapcomplemento !=null) {
				return new int[] {i, mapcomplemento};
				 
			 }
			 map.put(target - nums[i], i);
		}
		
	
		return nums;	
		
	 }
	 

}
