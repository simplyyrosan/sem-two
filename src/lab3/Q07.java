package lab3;

public final class Q07{

    public static int factorial(int n) {
        // if (n < 0) {
        //     throw new IllegalArgumentException("n must be >= 0");
        // }
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));  // 120
    }
}