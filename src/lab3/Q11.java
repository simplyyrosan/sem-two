package lab3;


public final class Q11 {

    public static int gcd(int m, int n) {
        m = Math.abs(m);
        n = Math.abs(n);

        if (n == 0) {
            return m;
        }
        return gcd(n, m % n);
    }

    public static void main(String[] args) {
        System.out.println(gcd(48, 18));   // 6
        System.out.println(gcd(-48, 18));  // 6
    }
}