import java.util.Stack;

public class Exercicio07 {

    public  boolean isValido(String s) {
        Stack<Character> abertos = new Stack<>();
        char[] stringSeparada = s.toCharArray();
        
        for (char c : stringSeparada){
            if (c == '(' || c == '[' || c == '{'){
                abertos.push(c);
            }
            else {
                if (abertos.isEmpty()){
                    return false;
                }
                char ultimoAberto = abertos.pop();

                if (c == ')' && ultimoAberto != '('){
                    return false;
                } else if (c == ']' && ultimoAberto != '[') {
                    return false;
                }  else if (c == '}' && ultimoAberto != '{') {
                    return  false;
                }
            }
        }

        return abertos.isEmpty();
    }
}
