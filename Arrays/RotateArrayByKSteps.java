package Arrays;

import java.util.*;

public class RotateArrayByKSteps {
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    // with extra-space
    // public static int[] rotateArrayByKSteps(int arr[], int k) {
    // int n = arr.length;
    // k = k % n;
    // int ans[] = new int[n];
    // int j = 0;
    // for (int i = n - k; i < n; i++) {
    // ans[j++] = arr[i];
    // }
    // for (int i = 0; i < n - k; i++) {
    // ans[j++] = arr[i];
    // }
    // return ans;
    // }

    // without extra-space
    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void reverse(int arr[], int i, int j) {
        while (i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }
    }

    public static void rotateArrayByKSteps(int arr[], int k) {
        int n = arr.length;
        k = k % n;
        reverse(arr, 0, n - k - 1);
        reverse(arr, n - k, n - 1);
        reverse(arr, 0, n - 1);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        System.out.println("Enter the Array elements:");
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the value of K:");
        int k = sc.nextInt();
        // int ans[] = rotateArrayByKSteps(arr, k);
        rotateArrayByKSteps(arr, k);
        System.out.println("The array rotated by " + k + " steps: ");
        printArray(arr);
        sc.close();
    }
}
