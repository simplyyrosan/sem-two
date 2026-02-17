package lab1;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][4];
        System.out.println("Enter 3-by-4 Matrix: ");
        for (int i = 0; i<3; i++) {
            for (int j = 0; j<4; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int j = 0; j<4; j++) {
            int sum = 0;
            for (int i=0; i<3; i++) {
                sum+=arr[i][j];
            }
            System.out.println("Sum of the elements at column "+ j +" is " + sum);
        }
        sc.close();
    }
}
