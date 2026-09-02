//Question -- Given an array, find the most frequent element in it.
//  If there are multiple elements that appear a maximum number of times, print any one of them.

package Hashing;

import java.util.*;

public class MostFrequentElement {

    public static int mostFrequentElement(int arr[]) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int el : arr) {
            if (!freq.containsKey(el)) {
                freq.put(el, 1);
            } else {
                freq.put(el, freq.get(el) + 1);
            }
        }
        int maxFrequency = -1;
        int ansKey = -1;
        for (var e : freq.entrySet()) {
            if (e.getValue() > maxFrequency) {
                maxFrequency = e.getValue();
                ansKey = e.getKey();
            }
        }
        return ansKey;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = mostFrequentElement(arr);
        System.out.println("The Most frequent element in the array is : " + ans);

        sc.close();
    }
}
