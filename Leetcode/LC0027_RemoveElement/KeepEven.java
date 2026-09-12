package Leetcode.LC0027_RemoveElement;

import java.util.*;

public class KeepEven {
    public static int keepEven(int arr[]) {
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
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
        int ans = keepEven(arr);
        System.out.println("The number of elements that are even: " + ans);
        sc.close();
    }
}
