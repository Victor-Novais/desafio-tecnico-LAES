

public class SomaDeDoisNum {
    public static void main(String[] args) {
        int[] nums = {3,3};
        int[] res=somar(nums, 6);
        System.out.println("["+res[0]+","+res[1]+"]");

    }
    public static int[] somar(int[] nums, int target) {
        for (int i = 0; i < nums.length ; i++) {
            for (int j = i+1; j < nums.length ; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException();
    }

}
