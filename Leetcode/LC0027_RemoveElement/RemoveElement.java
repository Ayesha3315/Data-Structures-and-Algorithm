package Leetcode.LC0027_RemoveElement;

import java.util.*;

public class RemoveElement {
    public static int removeElement(int arr[], int val) {
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != val) {
                arr[j] = arr[i];
                j++;
            }
        }
        return j;
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
        System.out.println("Enter the number you want to remove(val): ");
        int val = sc.nextInt();
        int ans = removeElement(arr, val);
        System.out.println("The number of elements which are not equal to " + val + " is: " + ans);
        sc.close();
    }
}
