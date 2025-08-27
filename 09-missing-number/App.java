import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc= new Scanner(System.in);
        String linha = sc.nextLine();
        sc.close();
        verificacao(linha);
    }

    public static void verificacao(String linha){
        String[] partes = linha.split(" ");
        int[] nums = new int[partes.length];
        for (int i = 0; i < partes.length; i++) {
            nums[i] = Integer.parseInt(partes[i]);
        }

      
        int n = nums.length;

        int somaEspera = n * (n + 1) / 2;

  
        int soma = 0;
        for (int i = 0; i < nums.length; i++) {
            soma += nums[i];
        }

        int faltando = somaEspera - soma;
        System.out.println(faltando);

    }
    }
