class Solution {
    public int helper(int i, int[] arr, int buy, int[][] dp){
        if(i >= arr.length) return 0;
        int profit = 0;
        if(dp[i][buy] != -1) return dp[i][buy];
        if(buy == 1){
            profit = Math.max(-arr[i] + helper(i+1, arr, 0, dp), helper(i+1, arr, 1, dp));
        }
        else {
            profit = Math.max(arr[i] + helper(i+1, arr, 1, dp), helper(i+1, arr, 0, dp));
        }
        return dp[i][buy] = profit;

    }
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[][] dp = new int[n+1][2];
        for(int[] arr : dp){
            Arrays.fill(arr, -1);
        }
        return helper(0, prices, 1, dp);
    }
}
