import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        Random variavel = new Random();
        int[] preco= new int[5];
        for (int i = 0; i < preco.length; i++) {
            preco[i]=variavel.nextInt(10);  
        }
        for (int i = 0; i < preco.length; i++) {
            System.out.println(preco[i]);
            
        }
        System.out.println("\n");
        calculo(preco);
        

    }
    public static void calculo(int preco[]){
        int precoMin=preco[0];
        int lucroMax =0;
        int lucroAtual=0;
        for (int i = 0; i < preco.length; i++) {
        precoMin = Math.min(precoMin, preco[i]);
        lucroAtual= preco[i] - precoMin;
        lucroMax = Math.max(lucroMax, lucroAtual);
        }
        

        System.out.println(lucroMax);

    }
}

