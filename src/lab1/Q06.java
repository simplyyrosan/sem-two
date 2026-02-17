package lab1;

import java.util.Scanner;

public class Q06 {
    public static boolean isOdd(int n) {
        int b = n&1;
        return (b == 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println(n + " is Odd: "+ isOdd(n));
        sc.close();
    }
}
