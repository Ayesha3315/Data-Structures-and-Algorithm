package Arrays;

import java.util.*;

public class LinearSearch {

    public static void linearSearch(int arr[], int k) {
        int ans = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k) {
                ans = i;
                break;
            }
        }
        if (ans != -1) {
            System.out.println("Element found at index: " + ans);
        } else {
            System.out.println("Element not present");
        }

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
        System.out.println("Enter the number you want to search:");
        int k = sc.nextInt();

        linearSearch(arr, k);
        sc.close();

    }

}
