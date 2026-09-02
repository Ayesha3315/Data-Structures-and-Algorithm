package Hashing;

import java.util.*;

public class IsAnagram {
    public static HashMap<Character, Integer> makeFrequencyMap(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            Character cr = str.charAt(i);
            if (!map.containsKey(cr)) {
                map.put(cr, 1);
            } else {
                map.put(cr, map.get(cr) + 1);
            }
        }
        return map;
    }

    public static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;
        HashMap<Character, Integer> map1 = makeFrequencyMap(s1);
        HashMap<Character, Integer> map2 = makeFrequencyMap(s2);
        return map1.equals(map2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string:");
        String s1 = sc.next();
        System.out.println("Enter the second string:");
        String s2 = sc.next();
        System.out.println("Are the two strings Anagram of each other: " + isAnagram(s1, s2));
        sc.close();
    }
}
