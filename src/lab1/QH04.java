package lab1;

import java.util.Scanner;

public class QH04 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter dimension of matrix: ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        double[][] a = new double[m][n], b = new double[m][n];
        System.out.println("Enter values for matrix a: ");
        for (int i = 0; i<m; i++)
            for (int j = 0; j<n; j++)
                a[i][j] = sc.nextDouble();
        
        System.out.println("Enter values for matrix b: ");
        for (int i = 0; i<m; i++)
            for (int j = 0; j<n; j++)
                b[i][j] = sc.nextDouble();
        
        System.out.println("Addtion of both matrix: ");
        double[][] c = addMatrix(a, b);
        for (int i = 0; i<m; i++) {
            for (int j = 0; j<n; j++)
                System.out.print(c[i][j] + " ");
            System.out.println();
        }
    }

    public static double[][] addMatrix(double[][] a, double[][] b) {
        int m = a.length, n = a[0].length;
        double[][] c = new double[m][n];
        for (int i = 0; i<m; i++)
            for (int j = 0; j<n; j++)
                c[i][j] = a[i][j] + b[i][j];
        return c;
    
    }
 }