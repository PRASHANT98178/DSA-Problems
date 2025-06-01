class Solution {
    public int helper(int i, int amount, int[] coins, int[][] dp) {
        if (i == 0) {
            return (amount % coins[0] == 0) ? 1 : 0;
        }
        
        if (dp[i][amount] != -1) return dp[i][amount];
        
        int notTake = helper(i - 1, amount, coins, dp);
        int take = 0;
        if (coins[i] <= amount) {
            take = helper(i, amount - coins[i], coins, dp);
        }
        
        return dp[i][amount] = take + notTake;
    }

    public int change(int amount, int[] coins) {
        int n = coins.length;
        int[][] dp = new int[n][amount + 1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return helper(n - 1, amount, coins, dp);
    }
}
