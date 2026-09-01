// Question Text:

// Check if we can partition the array into two subarrays with equal sum.
// More formally, check that the prefix sum of a part of the array is equal 
// to the suffix sum of rest of the array.

package Arrays;

import java.util.*;

public class EqualSumPartition {
    public static int totalSum(int arr[]) {
        int totalsum = 0;
        for (int i = 0; i < arr.length; i++) {
            totalsum = totalsum + arr[i];
        }
        return totalsum;
    }

    public static boolean equalSumPartition(int arr[]) {
        int sum = totalSum(arr);
        int prefixsum = 0;
        for (int i = 0; i < arr.length; i++) {
            prefixsum = prefixsum + arr[i];
            int suffixsum = sum - prefixsum;
            if (prefixsum == suffixsum) {
                return true;
            }
        }
        return false;

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
        System.out.println("Equal Sum partition: " + equalSumPartition(arr));
        sc.close();
    }
}
