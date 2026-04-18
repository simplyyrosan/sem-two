package lab3;

public class Q08 {
    public static double pow(double x, int n) {
        if (n==0) {
            return 1;
        }

        return x * pow(x, n-1);
    }
    public static void main(String[] args) {
        System.out.println(pow(2,4));
    }
}
