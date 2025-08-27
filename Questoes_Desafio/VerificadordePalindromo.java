public class VerificadordePalindromo {
    // Método para verificar se uma palavra é um palíndromo
    public boolean verificaPalindromo(String palavra) {
        String palavraInvertida = new StringBuilder(palavra).reverse().toString();// Inverte a palavra
        return palavra.equals(palavraInvertida);// Compara a palavra original com a invertida

    }

}
