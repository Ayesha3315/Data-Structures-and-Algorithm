package Arrays;

import java.util.*;

public class SortSquares {
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int[] sortSquares(int arr[]) {
        int left = 0;
        int right = arr.length - 1;
        int ans[] = new int[arr.length];
        int k = 0;
        while (left < right) {
            if (Math.abs(arr[left]) > Math.abs(arr[right])) {
                ans[k++] = arr[left] * arr[left];
                left++;
            } else {
                ans[k++] = arr[right];
                right--;
            }
        }
        return ans;
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
        int ans[] = sortSquares(arr);
        System.out.println("Sorted Squares:");
        printArray(ans);
        sc.close();

    }
}
