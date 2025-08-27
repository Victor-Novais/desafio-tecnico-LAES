public class SubindoEscadas {
    //Método para calcular o número de maneiras de subir n escadas
    public int subirEscadas(int n) {
        if (n <= 1) {//se n for 0 ou 1, só tem uma maneira de subir
            return 1;
        }
        int[] dp = new int[n + 1];//array para armazenar os resultados intermediários
        dp[0] = 1;//uma maneira de subir 0 escadas
        dp[1] = 1;//uma maneira de subir 1 escada

        //calcula o número de maneiras de subir cada número de escadas até n
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];//número de maneiras de subir i escadas é a soma das maneiras de subir i-1 e i-2 escadas
        }
        return dp[n];//retorna o número de maneiras de subir n escadas
    }

}
