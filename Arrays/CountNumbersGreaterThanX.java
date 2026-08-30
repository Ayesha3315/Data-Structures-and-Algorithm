package Arrays;

import java.util.*;

public class CountNumbersGreaterThanX {

    public static void countNumbersGreaterThanX(int arr[], int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > x) {
                count++;
            }
        }
        System.out.println("Count of numbers strictly greater than " + x + " is: " + count);
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
        System.out.println("Enter the value of x:");
        int x = sc.nextInt();
        countNumbersGreaterThanX(arr, x);
        sc.close();
    }

}
