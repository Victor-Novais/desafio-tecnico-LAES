package fizzbuzz;

import java.util.Arrays;

public class FizzBuzz {

	public static String[] fizzCheck(int n) {String[] s = new String[n+1];
	for(int i = 1; i<n+1;i++) {
		if(i%3==0 && i%5!=0) {s[i] = "Fizz";} else if(i%5==0&& i%3!=0) {s[i] = "Buzz";}
		else if (i%3 == 0 && i%5==0) {s[i]= "FizzBuzz";} else {s[i] = String.valueOf(i);}
		}
	return Arrays.copyOfRange(s, 1, n+1);
	}
}
