package Leetcode.LC0058_LengthOfLastWord;

import java.util.*;

public class CountNonSpacesCharacters {
    public static int countNonSpacesCharacters(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        int ans = countNonSpacesCharacters(str);
        System.out.println("The number of characters which are not spaces are: " + ans);
        sc.close();
    }
}
