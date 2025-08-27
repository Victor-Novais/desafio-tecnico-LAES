public class MissingNumber {
    //Método para encontrar o número ausente em um array
    public int missingNumber(int[] nums) {
        int n = nums.length;// Tamanho do array
        int somaEsperada = n * (n + 1) / 2;// Soma dos números de 0 a n
        int somaAtual = 0;// Soma dos números presentes no array
// Calcula a soma dos números no array
        for (int num : nums) {
            somaAtual += num;// Adiciona cada número à soma atual
        }
        return somaEsperada - somaAtual;// O número ausente é a diferença entre a soma esperada e a soma atual
    }

}
