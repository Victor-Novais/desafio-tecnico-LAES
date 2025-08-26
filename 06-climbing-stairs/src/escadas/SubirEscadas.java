package escadas;

public class SubirEscadas {

	public static int subir(int n) {
		if (n <= 1) {
	        return 1;
	    }
		return subir(n - 1) + subir(n - 2);
	}
}
