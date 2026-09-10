package Leetcode.LC0014_LongestCommonPrefix;

import java.util.*;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String strs[]) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        StringBuilder result = new StringBuilder();
        Arrays.sort(strs);
        char[] first = strs[0].toCharArray();
        char[] last = strs[strs.length - 1].toCharArray();
        int minLength = Math.min(first.length, last.length);
        for (int i = 0; i < minLength; i++) {
            if (first[i] != last[i]) {
                break;
            }
            result.append(first[i]);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array of strings: ");
        int n = sc.nextInt();
        sc.nextLine();
        String strs[] = new String[n];
        System.out.println("Enter the strings: ");
        for (int i = 0; i < n; i++) {
            strs[i] = sc.nextLine();
        }
        String prefix = longestCommonPrefix(strs);
        System.out.println("Longest Common Prefix: \"" + prefix + "\"");

        sc.close();
    }
}
