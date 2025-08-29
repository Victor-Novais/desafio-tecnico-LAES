import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Q3 {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Digite o numero:");
		int n=scan.nextInt();
		
		List<String> resulto=fizzbuzz(n);
		
		System.out.println(resulto);
		
		
		
	}
	
	public static List<String> fizzbuzz(int n){
		List<String> resultado= new ArrayList<>();
		
		for(int i =1;i<=n;i++) {
			if ((i%3==0) && (i%5==0)){	
				resultado.add("FizzBuzz");
			} else if (i%3==0) {
				resultado.add("Fizz");
			} else if (i%5==0) {
				resultado.add("Buzz");
			} else {
				resultado.add(String.valueOf(i));
			}
			
		}
		return resultado;
		
	}
	
	
		
	}


