
public class MaximumSubarray {

	public static void main(String[] args) {
		Integer resultado1 = maximumSubArray(new Integer[] {-2,1,-3,4,-1,2,1,-5,4});
		Integer resultado2 = maximumSubArray(new Integer[] {1});
		Integer resultado3 = maximumSubArray(new Integer[] {5,4,-1,7,8});
	
		System.out.println(resultado1);
		System.out.println(resultado2);
		System.out.println(resultado3);	
	}

	public static Integer maximumSubArray(Integer[] nums) {
		int somaMaxSubarray = 0;
		
		for (int i = 0; i < nums.length; i++) {
			int somaSubarray = 0;
			for (int j = i; j < nums.length; j++) {
				somaSubarray = somaSubarray + nums[j];
				if (somaSubarray > somaMaxSubarray) {
					somaMaxSubarray = somaSubarray;
				}
			}
		}
		
		return somaMaxSubarray;
	}
}
