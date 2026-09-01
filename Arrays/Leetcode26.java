// Leetcode-26. Remove Duplicates from Sorted Array
package Arrays;

import java.util.*;

public class Leetcode26 {
    public static int removeDuplicates(int arr[]) {
        int k = 1;
        for (int j = 1; j < arr.length; j++) {
            if (arr[j] != arr[j - 1]) {
                arr[k] = arr[j];
                k++;
            }
        }
        return k;
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
        System.out.println("The number of unique elements after removing dupicates: " + removeDuplicates(arr));
        sc.close();
    }
}
