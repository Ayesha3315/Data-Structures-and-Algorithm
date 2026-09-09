package Leetcode.LC0009_PalindromeNumber;

import java.util.*;

public class SumOfDigits {
    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum = sum + (num % 10);
            num = num / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int ans = sumOfDigits(num);
        System.out.println("The sum of the digits of the number is: " + ans);
        sc.close();
    }
}
