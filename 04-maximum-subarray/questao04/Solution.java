package questao04;

public class Solution {
    public int maxSubArray(int[] nums) {
        // Essa é uma implementação do algoritmo de Kadane que utiliza um único loop
        // e comparações usando a função Math.max() para identificar e guardar a maior soma
        int somaAtual=nums[0];
        int somaMax=nums[0];
        for (int i = 1; i < nums.length; i++) {
            // Se o nums[i] for maior do que a soma atual
            // a subarray é "resetada" começando a partir dele
            somaAtual = Math.max(somaAtual+nums[i],nums[i]);

            somaMax = Math.max(somaMax,somaAtual);
        }
        return somaMax;
    }
}
