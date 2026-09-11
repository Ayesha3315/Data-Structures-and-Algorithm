package Leetcode.LC0027_RemoveElement;

import java.util.*;

public class MoveZeroes {
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void moveZeroes(int arr[]) {
        int j = arr.length - 1;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] != 0) {
                arr[j] = arr[i];
                j--;
            }
        }
        while (j >= 0) {
            arr[j] = 0;
            j--;
        }
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
        System.out.println("The array after moving all zeroes to the front: ");
        moveZeroes(arr);
        printArray(arr);
        sc.close();
    }
}
