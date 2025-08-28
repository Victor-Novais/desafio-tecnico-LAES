public class SomaDeDoisNumeros {
    public static int[] twoSums(int[] nums, int target) {
        int index1 = 0, index2 = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < target) {
                for (int j = 1; j < nums.length; j++) {
                    if (nums[j] == target - nums[i]) {
                        index1 = i;
                        index2 = j;
                        break;
                    }
                }
            }
            if (index2 != 0) break;
        }

        return new int[]{index1, index2};
    }
}
