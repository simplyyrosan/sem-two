package lab1;

import java.util.Scanner;

public class QH02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of input lines: ");
        int n = sc.nextInt() + 1;
        String[] arr = new String[n];
        System.out.println("Enter your inputs: ");
        for (int i = 0; i<n; i++) {
            arr[i] = sc.nextLine();
        }

        System.out.println("\nReverse Order output: ");

        for (int i = n-1; i>=0; i--) {
            System.out.println(arr[i]);
        }

        sc.close();
    }
    
}
