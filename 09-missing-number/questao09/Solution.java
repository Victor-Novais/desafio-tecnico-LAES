package questao09;

class Solution {
    public int missingNumber(int[] nums) {
        // Usando a formula de somatorio e comparando com a soma atual
        // da array, podemos encontrar o número que falta
        int somatorioIntervalo = (nums.length * (nums.length + 1)) / 2;
        int somaArray = 0;
        for (int num : nums) {
            somaArray += num;
        }

        return somatorioIntervalo - somaArray;
    }
}