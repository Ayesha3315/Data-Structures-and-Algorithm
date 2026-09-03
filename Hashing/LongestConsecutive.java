package Hashing;

import java.util.*;

public class LongestConsecutive {
    public static int longestConsecutive(int arr[]) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr)
            set.add(num);

        int maxStreak = 0;
        for (int num : set) {
            if (!set.contains(num - 1)) {
                int currNum = num;
                int currStreak = 1;
                while (set.contains(currNum + 1)) {
                    currStreak++;
                    currNum++;
                }
                maxStreak = Math.max(maxStreak, currStreak);
            }
        }
        return maxStreak;
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
        System.out.println("The length of longest Consecutive elements: " + longestConsecutive(arr));
        sc.close();
    }
}
