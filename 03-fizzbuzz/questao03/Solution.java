package questao03;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> resposta = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                resposta.add("FizzBuzz");
            } else if (i % 3 == 0) {
                resposta.add("Fizz");
            } else if (i % 5 == 0) {
                resposta.add("Buzz");
            } else {
                resposta.add(Integer.toString(i));
            }
        }
        return resposta;
    }
}