package Leetcode.LC0028_IndexOfFirstOccurenceInString;

import java.util.*;

public class FindIndexOfFirstOccurrence {
    public static int findIndexOfFirstOccurrence(String haystack, String needle) {
        for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                if (haystack.substring(i, needle.length() + i).equals(needle)) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the haystack string: ");
        String haystack = sc.nextLine();

        System.out.println("Enter the needle string to find: ");
        String needle = sc.nextLine();

        int ans = findIndexOfFirstOccurrence(haystack, needle);
        System.out.println("The index of first occurence of needle in haystack is: " + ans);
        sc.close();
    }
}
