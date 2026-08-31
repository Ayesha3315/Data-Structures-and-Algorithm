package Arrays;

import java.util.*;

//brute-force
public class SortZerosAndOnes {
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Time-Complexity-n^2

    // public static void sortZerosAndOnes(int arr[]) {
    // int countZeroes = 0;
    // for (int i = 0; i < arr.length; i++) {
    // if (arr[i] == 0) {
    // countZeroes++;
    // }
    // }
    // for (int i = 0; i < arr.length; i++) {
    // if (i < countZeroes) {
    // arr[i] = 0;
    // } else {
    // arr[i] = 1;
    // }
    // }
    // }

    // Time complexity is n
    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void sortZerosAndOnes(int arr[]) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            if (arr[left] == 1 && arr[right] == 0) {
                swap(arr, left, right);
                left++;
                right--;
            } else if (arr[left] == 0) {
                left++;
            } else if (arr[right] == 1) {
                right--;
            }
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the Array elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sortZerosAndOnes(arr);
        System.out.println("The sorted array consisting of 0's and 1's:");
        printArray(arr);
        sc.close();
    }
}
