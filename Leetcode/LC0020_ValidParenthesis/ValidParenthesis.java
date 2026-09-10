package Leetcode.LC0020_ValidParenthesis;

import java.util.*;

public class ValidParenthesis {
    public static boolean isValid(String s) {
        if (s == null || s.length() % 2 != 0) {
            return false; // Valid bracket sequences must have an even length
        }
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(')');
            } else if (c == '{') {
                stack.push('}');
            } else if (c == '[') {
                stack.push(']');
            } else if (stack.isEmpty() || stack.pop() != c) {
                return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter string of brackets:");
        String s = sc.nextLine();
        boolean result = isValid(s);
        System.out.println("Is valid parenthesis: " + result);
        sc.close();

    }
}
