package Strings;

import java.util.*;

public class StringCompression {

    public static void stringCompression(String str) {
        String ans = str.charAt(0) + "";
        int count = 1;
        for (int i = 1; i < str.length(); i++) {
            char curr = str.charAt(i);
            char prev = str.charAt(i - 1);
            if (curr == prev) {
                count++;
            } else {
                if (count > 1)
                    ans = ans + count;
                ans = ans + curr;
                count = 1;
            }
        }
        if (count > 1)
            ans = ans + count;
        System.out.println(ans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        System.out.println("The string after compression : ");
        stringCompression(str);
        sc.close();
    }
}
