import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Digite o numero de escadas:");
		System.out.println(escada(scan.nextByte()));
		

	}
	
	public static int escada(int n) {
		Map<Integer,Integer> map = new HashMap<>();
		if (n==1 || n==2) {
			return n;
		}
		
		if (map.containsKey(n)) {
			return map.get(n);
		}
		
		int resultado=escada(n-1)+escada(n-2);
		map.put(n, resultado);
		return resultado;
	}

}
