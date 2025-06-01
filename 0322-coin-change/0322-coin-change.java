class Solution {

    public int helper(int i, int amount, int[] arr, int[][] dp){
        if(i == 0){
            if(amount % arr[0] == 0) return amount/arr[0];
            else {
                return 1000000000;
            }
        }

        if(dp[i][amount] != -1) return dp[i][amount];
        int nottake = helper(i-1, amount, arr, dp);
        int take = 1000000000;
        if(arr[i] <= amount){
            take = 1 + helper(i, amount-arr[i], arr, dp);
        }

        return dp[i][amount] = Math.min(take, nottake);
    }
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int[][] dp = new int[n+1][amount+1];

        for(int[] arr : dp){
            Arrays.fill(arr, -1);
        }

        int ans = helper(n-1, amount, coins, dp);
        if(ans == 1000000000) return -1;

        return ans;
    }
}