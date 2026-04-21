package lab3;

import java.util.Arrays;

public class Q17 {

    public static void rearrange(int[] A, int left, int right, int k) {
        // base case
        if (left >= right) {
            return;
        }

        // move left pointer if condition satisfied
        if (A[left] <= k) {
            rearrange(A, left + 1, right, k);
        }
        // move right pointer if condition satisfied
        else if (A[right] > k) {
            rearrange(A, left, right - 1, k);
        }
        // swap and move both
        else {
            int temp = A[left];
            A[left] = A[right];
            A[right] = temp;

            rearrange(A, left + 1, right - 1, k);
        }
    }

    public static void main(String[] args) {
        int[] A = {7, 2, 9, 1, 5, 8, 3};
        int k = 5;

        rearrange(A, 0, A.length - 1, k);

        System.out.println("Rearranged Array: " + Arrays.toString(A));
    }
}