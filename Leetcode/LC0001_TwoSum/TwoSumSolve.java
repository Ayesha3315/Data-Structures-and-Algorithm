package Leetcode.LC0001_TwoSum;

import java.util.*;

public class TwoSumSolve {
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int[] twoSumSolve(int nums[], int target) {
        HashSet<Integer> set = new HashSet<>();
        int ans[] = { -1 };
        for (int i = 0; i < nums.length; i++) {
            int needed = target - nums[i];
            if (set.contains(needed)) {
                ans = new int[] { needed, nums[i] };
                return ans;
            }
            set.add(nums[i]);
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int nums[] = new int[n];
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter the target element: ");
        int target = sc.nextInt();
        int ans[] = twoSumSolve(nums, target);
        System.out.println("The two numbers whose sum equals target is: ");
        printArray(ans);
        sc.close();

    }
}
