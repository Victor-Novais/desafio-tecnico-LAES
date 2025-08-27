public class ValidParentheses {
    // Método para verificar se a string de parênteses é válida
    public boolean isValid(String s) {
        java.util.Stack<Character> stack = new java.util.Stack<>();// Usando Stack para armazenar os parênteses de fechamento esperados
        for (char c : s.toCharArray()) {// Iterando sobre cada caractere na string
            if (c == '(') {// Se for um parêntese de abertura, empurre o correspondente de fechamento na pilha
                stack.push(')');
            } else if (c == '{') {
                stack.push('}');
            } else if (c == '[') {
                stack.push(']');
            } else if (stack.isEmpty() || stack.pop() != c) {// Se for um parêntese de fechamento, verifique se corresponde ao topo da pilha
                return false;// Se não corresponder ou a pilha estiver vazia, a string não é válida
            }
        }
        return stack.isEmpty();// No final, a pilha deve estar vazia para que a string seja válida
    }

}
