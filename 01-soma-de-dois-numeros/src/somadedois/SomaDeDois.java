package somadedois;

public class SomaDeDois {

public static int[] somar(int[] nums, int target) {
	
	for (int i = 0; i < nums.length; i++) {
		if (nums[i] < target && i < nums.length - 1) {
			for (int e = i + 1; e < nums.length; e++) {
				if (nums[i] + nums[e] == target) {
					return new int[] { i, e };
				}
			}
		}
	}
	return null;
}

}
