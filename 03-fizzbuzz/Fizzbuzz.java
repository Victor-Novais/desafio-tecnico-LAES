import java.util.ArrayList;
import java.util.List;

public class Fizzbuzz {

	public static void main(String[] args) {
		List<String> resultado1 = fizzbuzz(3);
		List<String> resultado2 = fizzbuzz(5);
		List<String> resultado3 = fizzbuzz(15);

		System.out.println(resultado1);
		System.out.println(resultado2);
		System.out.println(resultado3);

	}

	public static List<String> fizzbuzz(Integer n) {
		List<String> resposta = new ArrayList<String>();
		
		for (int i = 1; i <= n; i ++) {
			if (i % 3 == 0 && i % 5 == 0) {
				resposta.add("FizzBuzz");
			}
			else if (i % 3 == 0) {
				resposta.add("Fizz");
			}
			else if (i % 5 == 0) {
				resposta.add("Buzz");
			}
			else {
				resposta.add(String.valueOf(i));
			}
		}
		
		return resposta;
	}
}
