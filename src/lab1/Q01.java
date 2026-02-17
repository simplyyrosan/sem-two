package lab1;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("The positive integer greater than 2 from command line argument is: ");
        int n = sc.nextInt();
        int c = 0;
        while (n>2) {
            n = n/2;
            c++;
        }
        System.out.println(c);
        sc.close();
    }
}
