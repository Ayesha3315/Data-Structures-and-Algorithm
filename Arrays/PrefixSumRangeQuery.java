//Question---
// Given an array of integers of size n. 
// Answer q queries where you need to print the sum of values in a given range 
// of indices from l to r (both included).
// Note: The values of l and r in queries follow 1-based indexing.

package Arrays;

import java.util.*;

public class PrefixSumRangeQuery {

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int[] prefixSum(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i];
        }
        return arr;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array: ");
        int n = sc.nextInt();
        int arr[] = new int[n + 1];
        System.out.println("Enter the array elements: ");
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }
        int prefix[] = prefixSum(arr);
        System.out.println("Enter the number of queries:");
        int q = sc.nextInt();
        while (q-- > 0) {
            System.out.println("Enter the starting range:");
            int l = sc.nextInt();
            System.out.println("Enter the ending range:");
            int r = sc.nextInt();
            // Sum in range [l, r] = pref[r] - pref[l - 1]
            int ans = prefix[r] - prefix[l - 1];
            System.out.println("Sum from index " + l + " to " + r + " is: " + ans);
        }
        sc.close();

    }

}
