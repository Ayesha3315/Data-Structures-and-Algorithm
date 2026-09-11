package Leetcode.LC0026_RemoveDuplicatesFromSortedArray;

import java.util.*;

public class RemoveDuplicatesFromSortedArray {
    public static int removeDuplicatesFromSortedArray(int arr[]) {
        int i = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[i] == arr[j]) {
                continue;
            } else if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }
        return i + 1;
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
        int ans = removeDuplicatesFromSortedArray(arr);
        System.out.println("After removing duplicates,the number of unique elements is: " + ans);
        sc.close();
    }
}
