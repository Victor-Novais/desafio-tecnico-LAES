public class MergeIntervals {
    //Metodo para mesclar intervalos
public int[][] merge(int[][] intervals) {
        if (intervals.length == 0) {//verifica se o array esta vazio
            return new int[0][];//retorna um array vazio
        }

        java.util.Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));//ordena os intervalos com base no primeiro elemento de cada intervalo
        java.util.List<int[]> merged = new java.util.ArrayList<>();//cria uma lista para armazenar os intervalos mesclados
        int[] currentInterval = intervals[0];//inicia o primeiro intervalo como o intervalo atual
        merged.add(currentInterval);//adiciona o intervalo atual a lista de intervalos mesclados

        //Percorre os intervalos
        for (int[] interval : intervals) {
            if (interval[0] <= currentInterval[1]) {//verifica se o inicio do intervalo atual é menor ou igual ao fim do intervalo atual
                //se for, mescla os intervalos atualizando o fim do intervalo atual para o maior valor entre os dois fins
                currentInterval[1] = Math.max(currentInterval[1], interval[1]);//atualiza o fim do intervalo atual
            } else {//se nao for, inicia um novo intervalo
                currentInterval = interval;
                merged.add(currentInterval);
            }
        }
        return merged.toArray(new int[merged.size()][]);//converte a lista de intervalos mesclados de volta para um array e retorna
    }
}
