package Leetcode.LC0001_TwoSum;

import java.util.*;

public class PairWithGivenDifference {
    public static boolean pairWithGivenDifference(int nums[], int target) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i] - target) || set.contains(nums[i] + target)) {
                return true;
            }
            set.add(nums[i]);
        }
        return false;
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
        System.out.println("Does the pair of numbers exists whose difference equals target:"
                + pairWithGivenDifference(nums, target));
        sc.close();

    }
}
