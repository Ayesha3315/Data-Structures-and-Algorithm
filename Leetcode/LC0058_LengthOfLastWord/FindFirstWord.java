package Leetcode.LC0058_LengthOfLastWord;

import java.util.*;

public class FindFirstWord {
    public static String firstWord(String str) {
        int i = 0;
        while (i < str.length() && str.charAt(i) == ' ') {
            i++;
        }
        int start = i;
        while (i < str.length() && str.charAt(i) != ' ') {
            i++;
        }
        return str.substring(start, i);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        String ans = firstWord(str);
        System.out.println("The first word : " + ans);
        sc.close();
    }
}
