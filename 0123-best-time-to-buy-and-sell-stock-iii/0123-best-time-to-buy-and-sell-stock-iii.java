class Solution {

    public int helper(int i,int cap, int[] arr, int buy, int[][][] dp){
        if(i >= arr.length || cap == 0) return 0;
        int profit = 0;
        if(dp[i][buy][cap] != -1) return dp[i][buy][cap];
        if(buy == 1){
            profit = Math.max(-arr[i] + helper(i+1, cap, arr, 0, dp), helper(i+1, cap, arr, 1, dp));
        }
        else {
            profit = Math.max(arr[i] + helper(i+1, cap-1, arr, 1, dp), helper(i+1, cap, arr, 0, dp));
        }
        return dp[i][buy][cap] = profit;

    }

    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[][][] dp = new int[n+1][2][3];
        // for(int[] arr : dp){
        //     Arrays.fill(arr, -1);
        // }
        for(int i=0; i<dp.length; i++){
            for(int j=0; j<dp[i].length; j++){
                Arrays.fill(dp[i][j], -1);
            }
        }
        return helper(0, 2, prices, 1, dp);
    }
}