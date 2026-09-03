// Problem Statement:
// You are given n distinct pairs. 
// Each pair is numbered from 1 to n. 
// All these pairs are initially put in a bag. 
// You need to pair up each number. 
// You take numbers one by one from the bag and for each number you look
// whether the pair of this number has already been taken out of the bag, or not.
// If not (that means the pair of this number is still in the bag),
// you put the current number on the table in front of you. 
// Otherwise, you put both numbers from the pair aside. 
// Print the maximum number of numbers that were on the table at the same time.  

package Hashing;

import java.util.HashSet;
import java.util.Scanner;

public class MaxTableElements {

    public static int getMaxOnTable(int[] arr) {
        HashSet<Integer> table = new HashSet<>();
        int maxTableCount = 0;

        for (int num : arr) {
            if (table.contains(num)) {
                table.remove(num);
            } else {
                table.add(num);
            }
            maxTableCount = Math.max(maxTableCount, table.size());
        }
        return maxTableCount;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of pairs: ");
        if (!sc.hasNextInt()) {
            sc.close();
            return;
        }

        int n = sc.nextInt();
        int[] arr = new int[2 * n];

        System.out.println("Enter the elements: ");
        for (int i = 0; i < 2 * n; i++) {
            if (sc.hasNextInt()) {
                arr[i] = sc.nextInt();
            }
        }

        System.out.println("Maximum numbers on the table at the same time: " + getMaxOnTable(arr));

        sc.close();
    }
}