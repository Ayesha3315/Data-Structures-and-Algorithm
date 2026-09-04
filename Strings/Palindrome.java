package Strings;

import java.util.*;

public class Palindrome {
    public static void palindrome(String str) {
        int i = 0;
        int j = str.length() - 1;
        boolean flag = true;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                flag = false;
            }
            i++;
            j--;
        }
        if (flag == true) {
            System.out.println("The string is Palindrome");
        } else {
            System.out.println("The string is not Palindrome");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine();
        palindrome(str);
        sc.close();
    }
}
