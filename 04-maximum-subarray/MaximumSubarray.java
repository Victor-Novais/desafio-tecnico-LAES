

public class MaximumSubarray {
    public static void main(String[] args) {
        int[] nums = {5,4,-1,7,8};

        int maxSum = nums[0];
        int sum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            sum += nums[i];

            if (sum < nums[i]) {
                sum = nums[i];

            }else if(maxSum<sum){
                maxSum = sum;
            }
        }
        System.out.println(maxSum);
    }
}
