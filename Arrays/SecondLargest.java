package Arrays;

import java.util.*;

public class SecondLargest {
    public static void secondLargest(int arr[]) {
        int max = Integer.MIN_VALUE;
        int scndLargest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                scndLargest = max;
                max = arr[i];
            } else if (arr[i] > scndLargest && arr[i] != max) {
                scndLargest = arr[i];
            }
        }
        System.out.println("The second largest element is:" + scndLargest);
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
        secondLargest(arr);
        sc.close();
    }
}
