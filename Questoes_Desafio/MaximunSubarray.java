public class MaximunSubarray {
   //Método para encontrar a soma máxima de um subarray contíguo em um array de inteiros
    public int maxSubArray(int[] nums) {
        int maxAtual = nums[0];// Inicializa maxAtual com o primeiro elemento do array
        int maxGlobal = nums[0];// Inicializa maxGlobal com o primeiro elemento do array
        // Percorre o array a partir do segundo elemento

        // Atualiza maxAtual para ser o máximo entre o elemento atual e a soma de maxAtual com o elemento atual
        for (int i = 1; i < nums.length; i++) {
            maxAtual = Math.max(nums[i], maxAtual + nums[i]);
            if (maxAtual > maxGlobal) {// Se maxAtual for maior que maxGlobal
                maxGlobal = maxAtual;// Atualiza maxGlobal
            }
        }
        return maxGlobal;// Retorna a soma máxima encontrada
    }

}
