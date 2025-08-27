
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        sc.close();
        formas(n);
        
    }
    public static void formas(int n){
        int formas=0;
        int passoUm=1;
        int passoDois=2;
        if(n==1){
            formas=1;
        }
        if(n==2){
            formas=2;
        }

        for (int i = 3; i <= n; i++) {
            formas = passoUm + passoDois; 
            passoUm = passoDois; 
            passoDois = formas; 
               
        }
        System.out.println(formas);
    }
}
