public class SomadeDoisNumeros {
  //Método que retorna os índices dos dois números que somam o alvo
public int[] somaDois(int[] nums, int target) {
        int[] resultado = new int[2];//array para armazenar os índices
        for (int i = 0; i < nums.length; i++) {//percorre o array
            for (int j = i + 1; j < nums.length; j++) {//percorre o array a partir do próximo elemento
                if (nums[i] + nums[j] == target) {//verifica se a soma dos dois números é igual ao alvo
                    resultado[0] = i;//armazena o índice do primeiro número
                    resultado[1] = j;//armazena o índice do segundo número

                }
            }
        }
        //Mostra o resultado no console
        System.out.println("resultado: " + resultado[0] + " " + resultado[1]);
        return resultado;//retorna o array com os índices
    }
}
