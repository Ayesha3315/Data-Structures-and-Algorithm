package Arrays;

import java.util.*;

public class LargestElement {

    public static void largestElement(int arr[]) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > ans) {
                ans = arr[i];
            }
        }
        System.out.println("The largest Element in the array is: " + ans);
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
        largestElement(arr);
        sc.close();
    }

}
