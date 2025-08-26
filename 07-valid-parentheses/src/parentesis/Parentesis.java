package parentesis;
import java.util.Stack;
public class Parentesis {

	
	public static boolean validar(String s) {
		Stack<Character> st = new Stack<>();
		 for (char c : s.toCharArray()) {
	            if (c == '(' || c == '{' || c == '[') {
	                st.push(c);
	            }
	            else if (c == ')' || c == '}' || c == ']') {
	               
	                if (st.isEmpty()) return false; 
	                char top = st.peek();
	                if ((c == ')' && top != '(') ||
	                    (c == '}' && top != '{') ||
	                    (c == ']' && top != '[')) {
	                    return false;
	                }
	              
	                st.pop(); 
	            }
	        }
	       
	        return st.isEmpty(); 
	
}


}
