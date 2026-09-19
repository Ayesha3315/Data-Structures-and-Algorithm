package Leetcode.LC0066_PlusOne;

import java.util.*;

public class PlusOne {
    public static int[] plusOne(int digits[]) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] newDigits = new int[n + 1];
        newDigits[0] = 1; // Set the first slot to 1, rest default to 0
        return newDigits;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();

        int[] digits = new int[n];
        System.out.println("Enter the digits separated by spaces (e.g., 1 2 9):");
        for (int i = 0; i < n; i++) {
            digits[i] = sc.nextInt();
        }
        int[] result = plusOne(digits);

        System.out.println("\n--- Result ---");
        System.out.println("Array after adding one: " + Arrays.toString(result));

        sc.close();
    }
}
