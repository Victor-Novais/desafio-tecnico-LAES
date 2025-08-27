package questao06;

class Solution {
    public int climbStairs(int n) {
        // Utilizando recursão meu código não passou no leetcode com n = 43 por
        // Long Time Exception, logo tentei implementar a equação não recursiva
        // encontrada na wikipedia
        n++;
        // honestamente n sei pq, mas sem incrementar o N uma vez
        // os valores dão uma posição antes (n=2 mostra o valor de n=1)
        // acho que é por causa da equação começando em 0

        final double phi = (1+Math.sqrt(5))/2;
        double numerador = Math.pow(phi,n) - Math.pow(1-phi,n);
        double denominador = Math.sqrt(5);
        double fib = numerador/denominador;

        return (int) Math.round(fib);
    }
}