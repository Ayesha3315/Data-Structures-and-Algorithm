package Leetcode.LC0028_IndexOfFirstOccurenceInString;

import java.util.*;

public class FirstOccurenceOfCharacter {
    public static int firstOccurenceOfCharacter(String str, char target) {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.nextLine();
        System.out.println("Enter the target character:");
        char target = sc.next().charAt(0);
        int ans = firstOccurenceOfCharacter(str, target);
        System.out.println("The index of the first occurence of target character: " + ans);
        sc.close();
    }
}
