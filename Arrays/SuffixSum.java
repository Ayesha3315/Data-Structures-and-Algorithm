package Arrays;

import java.util.*;

public class SuffixSum {
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int[] suffixSum(int arr[]) {
        for (int i = arr.length - 2; i >= 0; i--) {
            arr[i] = arr[i] + arr[i + 1];
        }
        return arr;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int ans[] = suffixSum(arr);
        System.out.println("The suffix sum array: ");
        printArray(ans);
        sc.close();
    }
}
