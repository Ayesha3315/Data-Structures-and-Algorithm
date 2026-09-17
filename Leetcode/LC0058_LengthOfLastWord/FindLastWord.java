package Leetcode.LC0058_LengthOfLastWord;

import java.util.*;

public class FindLastWord {
    public static String lastWord(String str) {
        int i = str.length() - 1;
        while (i >= 0 && str.charAt(i) == ' ') {
            i--;
        }
        int end = i;
        while (i >= 0 && str.charAt(i) != ' ') {
            i--;
        }
        return str.substring(i, end + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        String ans = lastWord(str);
        System.out.println("The last word: " + ans);
        sc.close();
    }
}
