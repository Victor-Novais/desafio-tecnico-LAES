import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] num = {9,6,4,2,3,5,7,0,1};
        Arrays.sort(num);
        int contador = num[0];
        for (int i = num[0]; i < num.length; i++) {
            if (num[i] != contador ) {
                System.out.println(contador+" é o número faltando");
                return;
            }
            contador ++;
        }
        System.out.println(contador+" é o número faltando");
    }
}