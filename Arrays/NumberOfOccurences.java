package Arrays;

import java.util.*;

public class NumberOfOccurences {

    public static void numberOfOccurences(int arr[], int x) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                ans++;
            }
        }
        System.out.println("The number of occurences of " + x + " is: " + ans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the value of x: ");
        int x = sc.nextInt();
        numberOfOccurences(arr, x);
        sc.close();

    }
}
