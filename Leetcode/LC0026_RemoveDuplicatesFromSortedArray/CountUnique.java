package Leetcode.LC0026_RemoveDuplicatesFromSortedArray;

import java.util.*;

public class CountUnique {
    public static int countUnique(int arr[]) {
        if (arr.length == 0) {
            return 0;
        }
        int count = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                count++;
            }
        }
        return count;
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
        int ans = countUnique(arr);
        System.out.println("The count of unique elements in an array: " + ans);
        sc.close();
    }
}
