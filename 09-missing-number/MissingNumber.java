public class MissingNumber {
    public static int missingNumber(int[] nums) {
        int num = nums.length;

        for (int i = 0; i < nums.length; i++) {
            if (num == nums[i]) num--;
            return num;
        }
        return num;
    }
}
