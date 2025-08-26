import java.util.ArrayList;

public class FizzBuzz {
    public static void main(String[] args) {
        ArrayList<String> resp = new ArrayList<String>();
        int n = 15;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                resp.add("FizzBuzz");
            }
            else if (i % 3 == 0) {
                resp.add("Fizz");
            }
            else if (i % 5 == 0) {
                resp.add("Buzz");
            }
            else {
                resp.add(Integer.toString(i));
            }
        }
        System.out.println(resp);
    }

}