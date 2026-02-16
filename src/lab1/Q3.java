package lab1;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt(), num = n;
        int sum = 0, prod = 1;
        while (n>0) {
            int d = n%10;
            sum+=d;
            prod*=d;
            n/=10;            
        }

        System.out.println(num + " is " + (sum==prod ? "a " : "not a " ) + "Spy number");
        sc.close();
    }    
}
