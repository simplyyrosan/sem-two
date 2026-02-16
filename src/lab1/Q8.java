package lab1;

import java.util.Scanner;

public class Q8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row and column of 2D array: ");
        int r = sc.nextInt(), c = sc.nextInt(), sum = 0;
        int[][] arr = new int[r][c];
        System.err.print("Enter elements:");
        for (int i = 0; i<r; i++) {
            for (int j = 0; j<c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("The elements of 2D array are: ");
        for (int i = 0; i<r; i++) {
            for (int j = 0; j<c; j++) {
                System.out.print(arr[i][j] + " ");
                sum+=arr[i][j];
            }
            System.out.println();
        }

        System.out.println("Sum of elements: " + sum);

        sc.close();
    }
    
}
