import java.util.*;

public class buyAndsellStock {

    public static int maxProfit(int[] prices) {
        int maxRight = prices[prices.length-1];
        int maxProfit = 0;
        for(int i = prices.length - 2; i >= 0; i--){
            maxRight = Math.max(prices[i], maxRight);
            maxProfit = Math.max(maxProfit, maxRight - prices[i]);
        }
        return maxProfit; 
    }

    public static void main(String[] args) {
        int [] prices = {7,1,5,6,3,4};

        int profit = maxProfit(prices);

        System.out.println(profit);

    }
}
