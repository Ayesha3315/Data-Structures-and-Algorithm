package Leetcode.LC0026_RemoveDuplicatesFromSortedArray;

import java.util.*;

public class HasDuplicate {
    public static boolean hasDuplicate(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                return true;
            }
        }
        return false;
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
        boolean ans = hasDuplicate(arr);
        System.out.println("Has duplicates: " + ans);
        sc.close();

    }
}
