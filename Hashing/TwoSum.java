package Hashing;

import java.util.HashMap;
import java.util.Scanner;

public class TwoSum {
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int[] twoSum(int arr[], int target) {
        int n = arr.length;
        int ans[] = { -1 };
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int partner = target - arr[i];
            if (map.containsKey(partner)) {
                ans = new int[] { map.get(partner), i };
                return ans;
            } else {
                map.put(arr[i], i);
            }
        }
        return ans;
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
        System.out.println("Enter the target: ");
        int target = sc.nextInt();
        int ans[] = twoSum(arr, target);
        System.out.println("The indices of two elements whose sum is equal to the target is : ");
        printArray(ans);
        sc.close();
    }
}
