package Leetcode.LC0020_ValidParenthesis;

import java.util.*;

public class MaximumNestingDepth {
    public static int maximumNestingDepth(String s) {
        int currentDepth = 0;
        int maxDepth = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                currentDepth++;
                maxDepth = Math.max(currentDepth, maxDepth);
            } else if (ch == ')') {
                currentDepth--;
            }
        }
        return maxDepth;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the VPS string:");
        String s = sc.nextLine();
        int ans = maximumNestingDepth(s);
        System.out.println("The maximum depth of the valid parenthesis string is: " + ans);
        sc.close();
    }
}
