

public class ClimbingStairs {
    public static void main(String[] args) {
        int n = 2;
        int anteP = 1;
        int penul = 2;
        int QttdDePassos = 0;

        if (n <= 2) {
            System.out.println(n);
            return;
        }


        for (int i = 3; i <= n; i++) {
            QttdDePassos = anteP + penul;
            anteP = penul;
            penul = QttdDePassos;
        }
        System.out.println(QttdDePassos);
    }
}