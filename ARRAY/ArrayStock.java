import java.util.*;

public class ArrayStock {

    public static int buyAndSellStock(int prices[]) {
        int buyPrice = Integer.MAX_VALUE; // minimum price so far
        int maxProfit = 0; // maximum profit so far

        for (int i = 0; i < prices.length; i++) {
            if (buyPrice < prices[i]) { // profit possible
                int profit = prices[i] - buyPrice; // today's profit
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyPrice = prices[i]; // update buyPrice if current is smaller
            }
        }
        return maxProfit;
    }

    public static void main(String args[]) {
        int prices[] = {7, 1, 5, 3, 6, 4};  
        System.out.println(buyAndSellStock(prices));
    }
}
