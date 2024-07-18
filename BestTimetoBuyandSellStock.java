package solution;

public class BestTimetoBuyandSellStock {
    public static class Solution {
        public int maxProfit(int[] prices) {
            int lsf = Integer.MAX_VALUE; // Least so far
            int op = 0; // Overall profit
            int pist = 0; // Profit if sold today
            
            for(int i = 0; i < prices.length; i++){
                if(prices[i] < lsf){
                    lsf = prices[i];
                }
                pist = prices[i] - lsf;
                if(op < pist){
                    op = pist;
                }
            }
            return op;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] prices = {7, 1, 5, 3, 6, 4};
        int maxProfit = solution.maxProfit(prices);
        System.out.println("Maximum Profit: " + maxProfit); // Output should be 5

        prices = new int[]{7, 6, 4, 3, 1};
        maxProfit = solution.maxProfit(prices);
        System.out.println("Maximum Profit: " + maxProfit); // Output should be 0
    }
}
