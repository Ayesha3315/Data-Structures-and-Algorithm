package Leetcode.LC0028_IndexOfFirstOccurenceInString;

import java.util.*;

public class ContainsWord {
    public static boolean containsWord(String text, String word) {
        for (int i = 0; i <= text.length() - word.length(); i++) {
            int j = 0;
            while (j < word.length() && text.charAt(i + j) == word.charAt(j)) {
                j++;
            }
            if (j == word.length()) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the main text:");
        String text = sc.nextLine();

        System.out.println("Enter the word to search for:");
        String word = sc.nextLine();

        boolean ans = containsWord(text, word);

        System.out.println("Does the text contain the word? " + ans);

        sc.close();
    }
}