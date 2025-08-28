import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    public static String checkFizzBuzz(int numero) {
        if (numero % 3 == 0 && numero % 5 == 0) return "FizzBuzz";
        if (numero % 3 == 0) return "Fizz";
        if (numero % 5 == 0) return "Buzz";
        return String.valueOf(numero);
    }

    public static List<String> fizzBuzz(int numero) {
        List<String> fizzBuzzList = new ArrayList<>();

        for (int i = 1; i <= numero; i++) {
            fizzBuzzList.add(checkFizzBuzz(i));
        }
        return fizzBuzzList;
    }
}

