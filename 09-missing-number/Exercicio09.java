import java.util.ArrayList;
import java.util.Collections;

public class Exercicio09 {

    public int missingNumber(int[] nums) {
       int somaDePa = nums.length * (nums.length + 1 ) / 2;

       for (int num : nums){
           somaDePa -= num;
       }

       return somaDePa;
    }
}
