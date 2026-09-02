package Hashing;

import java.util.*;

public class IsIsomorphic {
    public static boolean isIsomorphic(String s1, String s2) {
        HashMap<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            Character s1Ch = s1.charAt(i);
            Character s2Ch = s2.charAt(i);
            if (map.containsKey(s1Ch)) {
                if (map.get(s1Ch) != s2Ch)
                    return false;
            } else if (map.containsValue(s2Ch)) {
                return false;
            } else {
                map.put(s1Ch, s2Ch);
            }
        }
        return true;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string:");
        String s1 = sc.next();
        System.out.println("Enter the second string:");
        String s2 = sc.next();
        System.out.println("Are the two strings Isomorphic : " + isIsomorphic(s1, s2));
        sc.close();
    }

}
