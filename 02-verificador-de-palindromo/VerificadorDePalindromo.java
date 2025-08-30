
public class VerificadorDePalindromo {

	public static void main(String[] args) {
		Boolean resultado1 = verificadorDePalindromo("A man, a plan, a canal: Panama");
		Boolean resultado2 = verificadorDePalindromo("race a car");
		Boolean resultado3 = verificadorDePalindromo("");
		System.out.println(resultado1);
		System.out.println(resultado2);
		System.out.println(resultado3);

	}

	public static Boolean verificadorDePalindromo(String s) {
		String palindromo = "";
		s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
		
		for (int i = s.length() - 1; i >= 0; i--) {
			palindromo += s.charAt(i);
		}
		
		if (palindromo.equals(s))
			return true;
		
		return false;
	}
}
