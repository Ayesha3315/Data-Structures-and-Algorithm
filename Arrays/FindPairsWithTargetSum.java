package Arrays;

import java.util.*;

public class FindPairsWithTargetSum {
    public static void findPairsWithTargetSum(int arr[], int target) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    count++;
                }
            }
        }
        System.out.println("The number of pairs whose sum is equal to " + target + " is: " + count);
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
        System.out.println("Enter the target value: ");
        int target = sc.nextInt();
        findPairsWithTargetSum(arr, target);
        sc.close();

    }

}
