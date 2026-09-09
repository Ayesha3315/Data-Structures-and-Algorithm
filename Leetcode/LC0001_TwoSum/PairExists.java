package Leetcode.LC0001_TwoSum;

import java.util.*;

public class PairExists {
    public static boolean doesPairExist(int nums[], int target) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            int needed = target - nums[i];
            if (set.contains(needed)) {
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
        System.out.println("Does the pair exist whose sum is equal to target:" + doesPairExist(nums, target));
        sc.close();
    }
}
