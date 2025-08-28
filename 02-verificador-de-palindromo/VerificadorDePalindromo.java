public class VerificadorDePalindromo {

    public boolean isPalindrome(String s) {
        String s2 = reverseString(formatString(s));
        return formatString(s).equals(s2);
    }

    public String formatString(String string) {
        StringBuilder newString = new StringBuilder();
        string.replace(" ", "")
                .toLowerCase()
                .chars()
                .filter(Character::isLetterOrDigit)
                .forEach(str -> newString.append((char) str));

        return newString.toString();
    }

    public String reverseString(String string) {
        char[] charArray = string.toCharArray();
        char[] newCharArray = new char[charArray.length];

        for (int i = 0, j = charArray.length-1 ; i < charArray.length; i++,j--) {
            newCharArray[i] = charArray[j];
        }
        return new String(newCharArray);
    }
}
