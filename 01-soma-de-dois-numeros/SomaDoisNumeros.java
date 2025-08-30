import java.util.Arrays;

public class SomaDoisNumeros {

	public static void main(String[] args) {
		Integer[] resultado1 = somaDoisNumeros(new Integer[] {2,7,11,15}, 9);
		Integer[] resultado2 = somaDoisNumeros(new Integer[] {3,2, 4}, 6);
		Integer[] resultado3 = somaDoisNumeros(new Integer[] {3, 3}, 6);
		System.out.println(Arrays.toString(resultado1));
		System.out.println(Arrays.toString(resultado2));
		System.out.println(Arrays.toString(resultado3));
	}

	public static Integer[] somaDoisNumeros(Integer[] nums, Integer target) {
        Integer[] resultado = new Integer[2];

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    resultado[0] = i;
                    resultado[1] = j;
                    return resultado; 
                }
            }
        }
        return null; 
    }
}
