package Leetcode.LC0001_TwoSum;

import java.util.*;

public class CountPairs {
    public static int countPairs(int nums[], int target) {
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int needed = target - nums[i];
            if (map.containsKey(needed)) {
                count = count + map.get(needed);
            }
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        return count;
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
        int ans = countPairs(nums, target);
        System.out.println("Count of pairs whose sum equals target:" + ans);
        sc.close();

    }
}
