package Strings;

import java.util.*;

public class ReverseWordsInSentence {
    public static void reverseWordsInSentence(String str) {
        String ans = "";
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != ' ') {
                sb.append(ch);
            } else { // when there is a space
                sb.reverse();
                ans = ans + sb;
                ans = ans + " ";
                sb.delete(0, sb.length());
            }
        }
        sb.reverse();
        ans = ans + sb;
        System.out.println("The reversed words in a sentence:\n" + ans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        reverseWordsInSentence(str);
        sc.close();
    }
}
