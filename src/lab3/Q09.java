package lab3;

public class Q09 {

    public static void printReversedDigits(int n) {
        if (n < 0) {
            System.out.print("-");
            n = -n;
        }
        if (n < 10) {
            System.out.print(n);
            return;
        }
        System.out.print(n % 10);
        printReversedDigits(n / 10);
    }

    public static void main(String[] args) {
        printReversedDigits(123);

        System.out.println("\n" + rev(123, 0));
    }

    public static int rev(int num, int res) {
        if (num==0) {
            return res;
        }
        return rev(num/10, res*10+(num%10));


    }
}

