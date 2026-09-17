package Leetcode.LC0058_LengthOfLastWord;

import java.util.*;

public class LengthOfLastWord {
    public static int lengthOfLastWord(String str) {
        int i = str.length() - 1;
        while (i >= 0 && str.charAt(i) == ' ') {
            i--;
        }
        int count = 0;
        while (i >= 0 && str.charAt(i) != ' ') {
            count++;
            i--;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        int ans = lengthOfLastWord(str);
        System.out.println("Length of last word is: " + ans);
        sc.close();
    }
}
