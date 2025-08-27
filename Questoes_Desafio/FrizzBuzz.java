//Biblioteca importada para utilizar listas
import java.util.ArrayList;
import java.util.List;

public class FrizzBuzz {
    //Metodo que retorna uma lista de strings
   public List<String> fizzBuzz(int n){
   List<String> fizzBuzz = new ArrayList<String>();//Cria uma lista vazia
   
   //Percorre os numeros de 1 ate n
  for(int i=1; i <= n; i++){
    boolean divisivelpor3 = (i%3 == 0);//Verifica se o numero e divisivel por 3
    boolean divisivelpor5 = (i%5 ==0); //Verifica se o numero e divisivel por 5
    if(divisivelpor3 && divisivelpor5){//Se for divisivel por 3 e por 5
        fizzBuzz.add("FizzBuzz");//Adiciona "FizzBuzz" na lista

    }else if(divisivelpor3){//Se for divisivel apenas por 3
        fizzBuzz.add("Fizz");//Adiciona "Fizz" na lista
    }else if(divisivelpor5){//Se for divisivel apenas por 5
        fizzBuzz.add("Buzz");//Adiciona "Buzz" na lista
    }else{//Se nao for divisivel por nenhum dos dois
        fizzBuzz.add(String.valueOf(i));//Adiciona o proprio numero na lista
    }
  }
  return fizzBuzz;//Retorna a lista preenchida
  }

}
