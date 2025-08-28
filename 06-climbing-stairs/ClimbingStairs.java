public class ClimbingStairs {
    public static int climbStars(int n){
        int[] possibilities = new int[n];
        possibilities[0] = 1;
        possibilities[1] = 2;

        for (int i = 2; i < n; i++) {
            possibilities[i] = possibilities[i - 1] + possibilities[i - 2];
        }

        return possibilities[n-1];
    }
}
