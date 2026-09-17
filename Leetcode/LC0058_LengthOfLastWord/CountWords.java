package Leetcode.LC0058_LengthOfLastWord;

import java.util.*;

public class CountWords {
    public static int countWords(String s) {
        int count = 0;
        boolean insideWord = false;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                // If we find a letter and we aren't already inside a word, it's a new word!
                if (!insideWord) {
                    count++;
                    insideWord = true;
                }
            } else {
                // We hit a space, so we are no longer inside a word
                insideWord = false;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string: ");
        String str = sc.nextLine();

        int ans = countWords(str);

        System.out.println("The number of words is: " + ans);

        sc.close();
    }
}