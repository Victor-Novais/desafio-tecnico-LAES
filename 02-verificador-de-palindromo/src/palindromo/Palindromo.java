package palindromo;

public class Palindromo {

	public static boolean isPalindrome(String s) {s = regularizar(s);
	char[] c = new char[s.length()];
	for(int i = 0;i<=s.length()-1;i++){c[i] = s.charAt((s.length()-1)-i);}
	if (s.equals(String.valueOf(c))) {return true;}
	else {return false;}
	}
	
	public static String regularizar(String s) {s = s.toLowerCase();
	for(int i = 0; i<s.length(); i++) {if (!Character.isLetterOrDigit(s.charAt(i))) {
		s = s.replace(Character.toString(s.charAt(i)), " ");
	}}
	s = s.replaceAll("\\s", ""); 
	return s;}
}
