package Arrays;

import java.util.*;

public class LastOccurence {

    public static void lastOccurence(int arr[], int x) {
        int ans = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                ans = i;
            }
        }
        System.out.println("The last occurence of " + x + " in the array is in the index:" + ans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the value of x: ");
        int x = sc.nextInt();
        lastOccurence(arr, x);
        sc.close();
    }

}
