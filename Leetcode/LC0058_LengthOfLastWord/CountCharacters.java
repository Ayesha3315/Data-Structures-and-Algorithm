package Leetcode.LC0058_LengthOfLastWord;

import java.util.*;

public class CountCharacters {
    public static int countCharacters(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        int ans = countCharacters(str);
        System.out.println("The number of characters in the given string is: " + ans);
        sc.close();

    }
}
