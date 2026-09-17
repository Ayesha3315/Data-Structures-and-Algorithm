package Leetcode.LC0035_SearchInsertPosition;

import java.util.*;

public class UpperBound {
    public static int upperBound(int arr[], int target) {
        int left = 0;
        int right = arr.length;
        while (left < right) {
            int mid = (left + right) / 2;
            if (arr[mid] > target) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target value:");
        int target = sc.nextInt();
        int ans = upperBound(arr, target);

        System.out.println("The upper bound (first index > target) is at index: " + ans);

        sc.close();

    }
}
