package Leetcode.LC0014_LongestCommonPrefix;

import java.util.*;

public class CountPrefixWords {
    public static int countPrefixWords(String strs[], String prefix) {
        int count = 0;
        if (strs == null || strs.length == 0) {
            return 0;
        }
        for (String word : strs) {
            if (word.startsWith(prefix)) {
                count++;
            }
        }
        return count;
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
        System.out.println("Enter the prefix word:");
        String prefix = sc.nextLine();
        int ans = countPrefixWords(strs, prefix);
        System.out.println("The count of words having common prefix are: " + ans);
        sc.close();
    }
}
