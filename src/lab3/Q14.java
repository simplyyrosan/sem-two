package lab3;

public class Q14 {

    public static int multiply(int a, int b) {
        // base case
        if (b == 0) {
            return 0;
        }

        // recursive case
        return a + multiply(a, b - 1);
    }

    public static void main(String[] args) {
        int result = multiply(5, 3);
        System.out.println("Product = " + result);
    }
}