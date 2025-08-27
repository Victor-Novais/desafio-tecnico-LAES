import java.util.HashMap;
import java.util.Map;

public class Exercicio01 {
    /**
     * O metodo analiza os valores de um dado array e percorre ele tentando encontrar possiveis valores
     * que possam se equivaler ao target]
     *
     * @param nums Um array de numeros que serão analizados
     * @param target O alvo que deve ser a soma de dois dos valores contidos no array nums
     * @return um array com as posições dos valores de nums que somados resultam em target
     */

    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> mapa = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            mapa.put(nums[i],i);
        }
        for (int i = 0; i < nums.length; i++) {
            //O possivel resultado de target é econtrado quando o valor alvo é subtraido do valor da posição atual
            int possivelResultado = target - nums[i];

            //Nesse trecho é verificado se o mapa com os nums contem o possivel valor
            if (mapa.containsKey(possivelResultado) && mapa.get(possivelResultado) != i){
                //Se contem o valor ele retorna as suas posições
                return new int[] {i, mapa.get(possivelResultado)};
            }
        }
        return new int[]{};
    }
}
