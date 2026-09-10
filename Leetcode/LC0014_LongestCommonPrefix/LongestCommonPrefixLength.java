package Leetcode.LC0014_LongestCommonPrefix;

import java.util.*;

public class LongestCommonPrefixLength {
    public static int longestCommonPrefixLength(String str[]) {
        if (str == null || str.length == 0) {
            return 0;
        }
        Arrays.sort(str);
        char[] first = str[0].toCharArray();
        char[] last = str[str.length - 1].toCharArray();
        int minLength = Math.min(first.length, last.length);
        int count = 0;
        for (int i = 0; i < minLength; i++) {
            if (first[i] != last[i]) {
                break;
            }
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array of strings:");
        int n = sc.nextInt();
        sc.nextLine();
        String str[] = new String[n];
        System.out.println("Enter the strings: ");
        for (int i = 0; i < n; i++) {
            str[i] = sc.nextLine();
        }
        int ans = longestCommonPrefixLength(str);
        System.out.println("The length of the longest common prefix is: " + ans);
        sc.close();
    }
}
