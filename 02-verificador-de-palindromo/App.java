import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a frase:");
        String frase = sc.nextLine();

        boolean resultado = teste(frase);
        String fraselimpa = frase.toLowerCase().replaceAll("[^a-z0-9]", "");
        resposta(resultado, fraselimpa);

        

        sc.close();
    }

    public static boolean teste(String frase) {
        
        String limpa = frase.toLowerCase().replaceAll("[^a-z0-9]", "");

        int esquerda = 0;
        int direita = limpa.length() - 1;

        while (esquerda < direita) {
            if (limpa.charAt(esquerda) != limpa.charAt(direita)) {
                return false;
            }
            esquerda++;
            direita--;
        }
        return true;
    }
    public static void resposta(boolean resultado, String fraselimpa){
        System.out.println("Saída: " + resultado);
        if (resultado) {
            System.out.println("Explicação: " + fraselimpa + " é um palindromo.");
        } else {
            System.out.println("Explicação: " + fraselimpa + " não é um palindromo.");
        }
    }
}
