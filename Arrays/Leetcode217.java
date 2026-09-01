// Leetcode-217. Contains Duplicate
package Arrays;

import java.util.*;

//brute-force
public class Leetcode217 {
    public static boolean containsDuplicate(int nums[]) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array: ");
        int n = sc.nextInt();
        int nums[] = new int[n];
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("Contains dupicate: " + containsDuplicate(nums));
        sc.close();
    }
}
