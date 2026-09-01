// Leetcode-121. Best Time to Buy and Sell Stock
package Arrays;

import java.util.*;

public class Leetcode121 {
    public static int buyAndSellStock(int prices[]) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else if (prices[i] - minPrice > maxProfit) {
                maxProfit = prices[i] - minPrice;
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
        System.out.println("The maximum profit you can achieve is: " + buyAndSellStock(prices));
        sc.close();
    }
}
