package lab1;

import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements of Array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0], min = arr[0];
        int maxCount = 0, minCount = 0;
        int firstMaxPos = -1, lastMinPos = -1;

        for (int i = 0; i < n; i++) {

            if (arr[i] > max) {
                max = arr[i];
                maxCount = 1;
                firstMaxPos = i + 1;
            } 
            else if (arr[i] == max) {
                maxCount++;
                if (firstMaxPos == -1) {
                    firstMaxPos = i + 1;
                }
            }


            if (arr[i] < min) {
                min = arr[i];
                minCount = 1;
                lastMinPos = i + 1;
            } 
            else if (arr[i] == min) {
                minCount++;
                lastMinPos = i + 1;
            }
        }

        System.out.println("Maximum element of Array is " + max + " and occurs " + maxCount + " times.");
        System.out.println("Minimum element of Array is " + min + " and occurs " + minCount + " times.");
        System.out.println("First occurrence of maximum element is at position " + firstMaxPos + ".");
        System.out.println("Last occurrence of minimum element is at position " + lastMinPos + ".");

        sc.close();

        // This is cool
    }
}

