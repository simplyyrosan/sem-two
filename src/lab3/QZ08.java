package lab3;

public class QZ08 {

    public static double pow(double x, int n) {
        // handle base case
        if (n == 0) return 1;

        // recursive call
        double half = pow(x, n / 2);

        // if n is even
        if (n % 2 == 0) {
            return half * half;
        } 
        // if n is odd
        else {
            return x * half * half;
        }
    }

    public static void main(String[] args) {
        System.out.println(pow(2, 4));  // 18.49
    }
}