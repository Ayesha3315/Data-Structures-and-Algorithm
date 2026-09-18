package Leetcode.LC0066_PlusOne;

import java.util.*;

public class AddOneToSingleDigit {
    public static int[] addOneToDigit(int digit) {
        if (digit < 9) {
            return new int[] { digit + 1, 0 };
        } else {
            return new int[] { 0, 1 };
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a single digit (0 to 9):");
        int digit = sc.nextInt();

        if (digit < 0 || digit > 9) {
            System.out.println("Invalid input! Please enter a single digit between 0 and 9.");
        } else {
            int[] result = addOneToDigit(digit);
            int newDigit = result[0];
            int carry = result[1];

            System.out.println("\n--- Results ---");

            if (carry > 0) {
                System.out.println("Answer: " + carry + newDigit);
                System.out.println("New digit slot: " + newDigit);
                System.out.println("Carry: " + carry);
                System.out.println("Note: Since it was 9, adding 1 gives 10 (Carry of 1 passed to the left).");
            } else {
                System.out.println("Answer: " + newDigit);
                System.out.println("New digit slot: " + newDigit);
                System.out.println("Carry: " + carry);
            }
        }

        sc.close();
    }
}