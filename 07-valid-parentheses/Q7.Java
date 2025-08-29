import java.util.Scanner;
import java.util.Stack;

public class Q7 {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Digite os parenteses:");
		System.out.println(Parentheses(scan.next()));

	}
	
	public static boolean Parentheses(String s) {
		Stack<Character> Aberto= new Stack<>();
		
		for(int i =0;i<s.length();i++) {
			char parenteses = s.charAt(i);
			if(parenteses=='(' || parenteses == '[' || parenteses == '{') {
				Aberto.push(parenteses);
			} else if (Aberto.isEmpty()) {
				return false;
			} else if (parenteses == ')' && Aberto.peek() == '(') {
				Aberto.pop();
			} else if (parenteses == ']' && Aberto.peek() == '[') {
				Aberto.pop();
			} else if (parenteses == '}' && Aberto.peek() == '{') {
				Aberto.pop();
			} else {
				return false;
			}
		}
		return Aberto.isEmpty() ? true : false;
	}

}
