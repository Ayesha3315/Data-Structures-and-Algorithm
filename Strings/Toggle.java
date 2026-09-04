package Strings;

import java.util.*;

public class Toggle { // toggle-> converting capital letters to small letters and vice-versa
    public static void toggle(StringBuilder str) {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ' ')
                continue;
            int asci = (int) ch;
            boolean flag = true; // capital letter
            if (asci >= 97)
                flag = false; // small letter

            if (flag == true) {
                asci = asci + 32;
                char c = (char) asci;
                str.setCharAt(i, c);
            } else {
                asci = asci - 32;
                char c = (char) asci;
                str.setCharAt(i, c);
            }
        }
        System.out.println(str);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        StringBuilder str = new StringBuilder(sc.nextLine());
        System.out.println("The string after toggle: ");
        toggle(str);
        sc.close();

    }
}
