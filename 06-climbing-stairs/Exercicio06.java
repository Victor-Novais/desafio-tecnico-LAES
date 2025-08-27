public class Exercicio06 {

    /**
     * Calcula o número de formas distintas de subir uma escada de n degraus,
     * onde é possível subir 1 ou 2 degraus por vez.
     * Utiliza programação dinâmica para armazenar os resultados intermediários.
     *
     * @param n Número total de degraus da escada
     * @return Quantidade de formas distintas de subir a escada
     */
    public int formasDeSubirEscada(int n){
        int[] fb = new int[n + 1];
        fb[0] = 1;
        fb[1] = 1;

        for (int i = 2; i <= n; i++) {
            fb[i] = fb[i-1] + fb[i-2];
        }
        return fb[n];
    }
}
