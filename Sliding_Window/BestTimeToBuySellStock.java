// File: Easy/BestTimeToBuySellStock.java
public class BestTimeToBuySellStock {
    public static int maxProfit(int[] prices) {
        int min = prices[0], profit = 0;
        for (int price : prices) {
            min = Math.min(min, price);
            profit = Math.max(profit, price - min);
        }
        return profit;
    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println("Max Profit: " + maxProfit(prices)); // Output: 5
    }
}
