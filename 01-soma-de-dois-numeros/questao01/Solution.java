package questao01;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] resultado = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    resultado[0] = i;
                    resultado[1] = j;
                    break;
                }
            }
        }
        return resultado;
    }
}