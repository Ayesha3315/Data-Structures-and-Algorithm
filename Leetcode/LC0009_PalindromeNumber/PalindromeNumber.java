package Leetcode.LC0009_PalindromeNumber;

import java.util.*;

public class PalindromeNumber {
    public static int reverse(int num) {
        int rev = 0;
        while (num > 0) {
            rev = (rev * 10) + num % 10;
            num = num / 10;
        }
        return rev;
    }

    public static boolean checkPalindrome(int num) {
        if (num < 0) {
            return false;
        }
        int originalNumber = num;
        int reverseNum = reverse(num);
        if (originalNumber == reverseNum) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        System.out.println("Is the number Palindrome: " + checkPalindrome(num));
        sc.close();
    }
}
