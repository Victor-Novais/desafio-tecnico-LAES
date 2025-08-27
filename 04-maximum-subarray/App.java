
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc= new Scanner (System.in);
        System.out.print("Digite o tamanho do array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];


        System.out.println("Digite os elementos do array:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        soma(nums);
        sc.close();
        
    }
    public static void soma(int nums[]){
        int maximaAtual=0;
        int maximaGlobal=0;
        for (int i = 0; i < nums.length; i++) {
            int elementoatual=nums[i];
            maximaAtual = Math.max(elementoatual, maximaAtual + elementoatual);
            maximaGlobal = Math.max(maximaGlobal, maximaAtual);
            
        }
        System.out.println(maximaGlobal);
    }
}
