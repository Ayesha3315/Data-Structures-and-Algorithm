package Leetcode.LC0014_LongestCommonPrefix;

import java.util.*;

public class CheckPrefix {

    public static boolean isPrefix(String s, String pref) {
        if (s == null || pref == null) {
            return false;
        }

        // Standard built-in approach
        return s.startsWith(pref);
    }

    // Alternative approach without built-in methods
    public static boolean isPrefixManual(String s, String pref) {
        if (s == null || pref == null || pref.length() > s.length()) {
            return false;
        }

        for (int i = 0; i < pref.length(); i++) {
            if (s.charAt(i) != pref.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the original string (s):");
        String s = sc.nextLine();

        System.out.println("Enter the prefix string (pref):");
        String pref = sc.nextLine();

        boolean result = isPrefix(s, pref);
        System.out.println("Is \"" + pref + "\" a prefix of \"" + s + "\"? " + result);

        sc.close();
    }
}
