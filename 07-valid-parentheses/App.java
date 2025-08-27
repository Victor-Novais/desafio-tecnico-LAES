
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String frase = sc.nextLine();
        sc.close();

        System.out.println(validacao(frase));
    }

    public static boolean validacao(String frase) {
        String vali = ""; 
        char[] caraqteres = frase.toCharArray();
        char ultimo;
        char c; 
        for (int i = 0; i < caraqteres.length; i++) {
            c = caraqteres[i];

            
            if (c == '(' || c == '{' || c == '[') {
                vali += c;
            } else {
                if (vali.isEmpty()) return false; 

                ultimo = vali.charAt(vali.length() - 1);

                if ((c == ')' && ultimo == '(') ||
                    (c == '}' && ultimo == '{') ||
                    (c == ']' && ultimo == '[')) {
                    
                    vali = vali.substring(0, vali.length() - 1);
                } else {
                    return false;
                }
            }
        }

        
        return vali.isEmpty();
    }
}

