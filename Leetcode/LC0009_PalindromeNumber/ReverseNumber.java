package Leetcode.LC0009_PalindromeNumber;

import java.util.*;

public class ReverseNumber {
    public static int reverseNumber(int num) {
        int reverse = 0;
        while (num > 0) {
            reverse = (reverse * 10) + num % 10;
            num = num / 10;
        }
        return reverse;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int ans = reverseNumber(num);
        System.out.println("Reverse of a number: " + ans);
        sc.close();

    }
}
