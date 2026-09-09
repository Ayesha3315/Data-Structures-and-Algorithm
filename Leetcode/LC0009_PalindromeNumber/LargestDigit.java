package Leetcode.LC0009_PalindromeNumber;

import java.util.*;

public class LargestDigit {
    public static int largestDigit(int num) {
        int largest = 0;
        while (num > 0) {
            int lastDigit = num % 10;
            if (lastDigit > largest) {
                largest = lastDigit;
            }
            num = num / 10;
        }
        return largest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int ans = largestDigit(num);
        System.out.println("The largest digit of the number is: " + ans);
        sc.close();
    }
}
