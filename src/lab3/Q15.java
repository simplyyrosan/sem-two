package lab3;

public class Q15 {
    public static String reverse(String str, int n) {
        // base case
        if (n == 0) {
            return "";
        }

        // take last character and recurse
        return str.charAt(n - 1) + reverse(str, n - 1);
    }

    public static void main(String[] args) {
        System.out.println(reverse("hello", 5));
    }
}
