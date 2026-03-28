package lab3;

public class Q08 {
    public static double pow(double x, int n) {
        if (n==1) {
            return x;
        }

        return x * pow(x, n-1);
    }
    public static void main(String[] args) {
        System.out.println(pow(4.3,2));
    }
}
