package leetcode.easy;

public class _70_ClimbingStairs {

    public static void main(String[] args) {
        System.out.println("climbStairs() = " + climbStairs());
    }

    private static int climbStairs() {
        int n = 5;

        int[] dp = new int[n];
        dp[0] = 1;
        if (n >= 2) {
            dp[1] = 2;
            for (int i = 2; i < n; i++) {
                dp[i] = dp[i - 1] + dp[i - 2];
            }
        }
        return dp[n-1];
    }

}
