import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("numero?");
        int numero= sc.nextInt();
        String[] resposta = new String[numero];
        String[] resultado = verificador(numero, resposta);
        System.out.println(Arrays.toString(resultado));
        
    }
    public static String[] verificador(int numero, String[] resposta){
        for (int i = 1; i <= numero; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                resposta[i - 1] = "FizzBuzz";
            } else if (i % 3 == 0) {
                resposta[i - 1] = "Fizz";
            } else if (i % 5 == 0) {
                resposta[i - 1] = "Buzz";
            } else {
                resposta[i - 1] = String.valueOf(i);
            }
        }

        return resposta;

    }
}
