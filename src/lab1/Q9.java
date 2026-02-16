package lab1;

import java.util.Scanner;

public class Q9 {

    public static double sumMajorDiagonal(double[][] m) {
        int sum = 0;
        for (int i = 0; i<m.length; i++)
            sum+=m[i][i];
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] arr = new double[4][4];
        System.err.print("Enter elements:");
        for (int i = 0; i<4; i++) {
            for (int j = 0; j<4; j++) {
                arr[i][j] = sc.nextDouble();
            }
        }
        System.out.println("Sum of major diagonal: "+ sumMajorDiagonal(arr));

        sc.close();
    }
}
