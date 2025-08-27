public class Exercicio04 {
    /**
     * Analiza qual é o subarray com a maior soma possivel de valores seguidos
     * @param nums Array de inteiros que será analizada
     * @return A maior soma possivel dos sub arrays de nums
     */
    public  int maximoSubArray(int[] nums) {
        int somaAtual = nums[0];
        int maior = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] + somaAtual > nums[i]){
                somaAtual += nums[i];
            } else {
                somaAtual = nums[i];
            }
            if (somaAtual > maior){
                maior = somaAtual;
            }
        }
        return maior;
    }
}
