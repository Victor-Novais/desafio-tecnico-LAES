package maximumSubArray;

public class MaximumSubArray {

	public static int maximumSum(int[] a) {
		int maximaSoma = a[0];
		int somaAtual = a[0];
		for(int i = 0; i<a.length;i++) {somaAtual = a[i];
		for (int j = i+1;j<a.length;j++) {
			
			somaAtual = somaAtual + a[j];
			if(somaAtual>maximaSoma) {maximaSoma = somaAtual;}
		}
		}
		return maximaSoma;
	}
	
}
