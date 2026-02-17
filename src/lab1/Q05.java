package lab1;

import java.util.Scanner;

public class Q05 {

    public static int sum_Of_Digits(int n) {
        int sum = 0;
        while (n>0) {
            int d = n%10;
            sum+=d;
            n/=10;
        }
        if (sum<10)
            return sum;
        else 
            return sum_Of_Digits(sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Sum of digits of " + n + " until the number is a single digit is " + sum_Of_Digits(n));
        sc.close();
    }
    
}
