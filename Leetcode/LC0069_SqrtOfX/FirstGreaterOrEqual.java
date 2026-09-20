package Leetcode.LC0069_SqrtOfX;

import java.util.*;

public class FirstGreaterOrEqual {

    public static int firstGreaterOrEqual(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int answer = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] >= target) {
                answer = nums[mid];
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the sorted array:");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter " + n + " sorted numbers separated by spaces (duplicates allowed):");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("Enter the target number:");
        int target = sc.nextInt();

        int result = firstGreaterOrEqual(nums, target);

        System.out.println("\n--- Result ---");
        if (result != -1) {
            System.out.println("The first number >= " + target + " is: " + result);
        } else {
            System.out.println("No number in the array is greater than or equal to " + target);
        }

        sc.close();
    }
}