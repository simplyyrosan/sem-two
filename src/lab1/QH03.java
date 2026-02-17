package lab1;

import java.util.Scanner;

public class QH03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter lenght of arrays: ");
        int n = sc.nextInt();
        int[] a = new int[n], b = new int[n], c = new int[n];

        System.out.println("Enter values for 'a' array: ");
        for (int i = 0; i<n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter values for 'b' array: ");
        for (int i = 0; i<n; i++) {
            b[i] = sc.nextInt();
        }

        System.out.println("The dot product 'c' array: ");
        for (int i = 0; i<n; i++) {
            c[i] = a[i]*b[i];
            System.out.print(c[i]+" ");
        }

        sc.close();
    }
}
