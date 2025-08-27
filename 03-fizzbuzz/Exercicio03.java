import java.util.ArrayList;
import java.util.List;

public class Exercicio03 {
    /**
     * Gera um array de String com a lógica do FizzBuzz
     * - "FizzBuzz" se o indice for divisível por 15
     * - "Fizz" se o indice for divisível por 3
     * - "Buzz" se o indice for divisível por 5
     * - O proprio número caso não seja dividido por nenhum desses
     *
     * @param n Valor de indices a partir de um que serão analizados, a partir de 1
     * @return Um array de Strings  com o resultado do FizzBuzz
     */
    public List<String> fizzBuzz(int n){
        List<String> lista = new ArrayList<String>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                lista.add("FizzBuzz");
            } else if (i % 3 == 0) {
                lista.add("Fizz");
            } else if (i % 5 == 0) {
                lista.add("Buzz");
            } else{
                lista.add(String.valueOf(i));
            }
        }
        return lista;
    }
}
