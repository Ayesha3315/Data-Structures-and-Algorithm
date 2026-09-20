package Leetcode.LC0069_SqrtOfX;

import java.util.*;

public class BinarySearchDemo {

    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the sorted array:");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter " + n + " sorted numbers separated by spaces:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("Enter the target number to search for:");
        int target = sc.nextInt();

        int resultIndex = search(nums, target);

        System.out.println("\n--- Result ---");
        if (resultIndex != -1) {
            System.out.println("Target " + target + " found at index: " + resultIndex);
        } else {
            System.out.println("Target " + target + " was not found in the array (-1).");
        }

        sc.close();
    }
}