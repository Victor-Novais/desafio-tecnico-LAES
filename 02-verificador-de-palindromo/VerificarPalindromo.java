

public class VerificarPalindromo {
    public static void main(String[] args) {

        verificarPalindromo(" ");
    }

    public static void verificarPalindromo(String s) {
        String sFiltrada = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(sFiltrada);
        String sRevertida = "";
        for (int i = sFiltrada.length() - 1; i >= 0; i--) {
            sRevertida += sFiltrada.charAt(i);
        }
        if (sRevertida.equals(sFiltrada)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
