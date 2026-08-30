package Arrays;

import java.util.*;

public class ArraySortedOrNot {

    public static boolean arraySortedOrNot(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        boolean isSorted = arraySortedOrNot(arr);
        System.out.println("Is the array Sorted? : " + isSorted);
        sc.close();
    }
}
