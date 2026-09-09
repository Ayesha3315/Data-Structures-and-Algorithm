package Leetcode.LC0009_PalindromeNumber;

import java.util.*;

public class CountDigits {
    public static int countNumberOfDigits(int num) {
        int count = 0;
        while (num > 0) {
            num = num / 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int ans = countNumberOfDigits(num);
        System.out.println("The count of digits in a number: " + ans);
        sc.close();
    }
}
