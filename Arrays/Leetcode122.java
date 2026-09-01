// Leetcode-122. Best Time to Buy and Sell Stock II
package Arrays;

import java.util.*;

public class Leetcode122 {
    public static int buyAndSellStock2(int prices[]) {
        int maxProfit = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i] < prices[i + 1]) {
                maxProfit = maxProfit + (prices[i + 1] - prices[i]);
            }
        }
        return maxProfit;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array: ");
        int n = sc.nextInt();
        int prices[] = new int[n];
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < prices.length; i++) {
            prices[i] = sc.nextInt();
        }
        System.out.println("The Maximum profit you can achieve is : " + buyAndSellStock2(prices));
        sc.close();
    }
}
