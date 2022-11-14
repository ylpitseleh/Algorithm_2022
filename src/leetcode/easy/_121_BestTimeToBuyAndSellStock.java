package leetcode.easy;

public class _121_BestTimeToBuyAndSellStock {

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
//        int[] prices = {7,6,4,3,1};
        System.out.println("maxProfit() = " + maxProfit(prices));
    }

    private static int maxProfit(int[] prices) {
        int ans = 0;
        int min = Integer.MAX_VALUE;
        for (int i=0; i<prices.length; i++) {
            min = Math.min(min, prices[i]);
            ans = Math.max(ans, prices[i] - min);
        }
        return ans;
    }
}
