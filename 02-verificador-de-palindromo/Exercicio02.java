public class Exercicio02 {
    /**
     * Verifica se uma string é ou não um palíndromo
     *
     * @param s String que será verificada se é um palíndromo ou não
     * @return true se for um palíndromo e false caso não seja
     */
    public boolean isPalindromo(String s){
        // Transforma a string s em StringBuilder para remover caracteres indesejados (não alfanuméricos)

        StringBuilder string = new StringBuilder();
        for (char caractere : s.toLowerCase().trim().toCharArray()) {
            if (Character.isLetterOrDigit(caractere)) {
                string.append(caractere);
            }
        }

        //Verifica se a string tratada é ou não um palíndromo
        char[] sArray = string.toString().toCharArray();
        int j = sArray.length - 1;
        for (int i = 0; i < sArray.length; i++) {
            if (sArray[i] != sArray[j]) {
                return false;
            }
            j--;
        }
        return true;
    }
}
