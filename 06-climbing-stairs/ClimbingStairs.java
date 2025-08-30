
public class ClimbingStairs {

	public static void main(String[] args) {
		Integer resultado1 = climbingStairs(2);
		Integer resultado2 = climbingStairs(3);
		System.out.println(resultado1);
		System.out.println(resultado2);

	}

	public static Integer climbingStairs(Integer n) {
		if (n <= 2) {
			return n;
		}
		
		int a = 1, b = 2;
		
		for (int i = 3; i <= n; i++) {
			int temp = a + b;
			a = b;
			b = temp;
		}
		return b;
	}
}
