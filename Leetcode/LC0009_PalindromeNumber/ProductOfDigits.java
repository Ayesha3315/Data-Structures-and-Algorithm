package Leetcode.LC0009_PalindromeNumber;

import java.util.*;

public class ProductOfDigits {
    public static int productOfDigits(int num) {
        int prod = 1;
        while (num > 0) {
            prod = prod * (num % 10);
            num = num / 10;
        }
        return prod;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int ans = productOfDigits(num);
        System.out.println("The product of the digits of the number is: " + ans);
        sc.close();
    }
}
