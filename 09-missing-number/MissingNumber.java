
public class MissingNumber {

	public static void main(String[] args) {
		Integer resultado1 = missingNumber(new Integer[] {3, 0, 1});
		Integer resultado2 = missingNumber(new Integer[] {0, 1});
		Integer resultado3 = missingNumber(new Integer[] {9,6,4,2,3,5,7,0,1});

		System.out.println(resultado1);
		System.out.println(resultado2);
		System.out.println(resultado3);

	}

	public static Integer missingNumber(Integer[] nums) {
		int n = nums.length;
		int pa = n * (n + 1) / 2;
		int soma = 0;

		for (int i = 0; i < n; i++) {
			soma += nums[i];

		}
		return pa - soma;
	}
}
