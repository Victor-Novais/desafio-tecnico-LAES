import java.util.Scanner;

public class Q2 {
	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("digite a palavra:");
		System.out.println(Polidromo(scan.next()));
				
		
	}
	
	public static boolean Polidromo(String nome) {
		nome= nome.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		
		int esquerda = 0;
		int direita = nome.length()-1;
		
		while(esquerda<direita) {
			if(nome.charAt(esquerda)!=nome.charAt(direita)) {
				return false;
			}
			esquerda++;
			direita--;
		}
		return true;
		
	}

}
