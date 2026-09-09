package Leetcode.LC0009_PalindromeNumber;

import java.util.*;

public class CountOccurencesOfDigit {
    public static int countOccurencesOfDigit(int num, int d) {
        int count = 0;
        while (num > 0) {
            int digit = num % 10;
            if (digit == d) {
                count++;
            }
            num = num / 10;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        System.out.println("Enter the digit: ");
        int d = sc.nextInt();
        int ans = countOccurencesOfDigit(num, d);
        System.out.println("Count of ocuurences of a digit in a number is: " + ans);
        sc.close();
    }
}
