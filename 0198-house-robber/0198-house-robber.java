class Solution {
    public int helper(int i, int[] arr, int[] dp){
        if(i < 0) return 0;

        if(dp[i] != -1) return dp[i];
        int take = arr[i] + helper(i-2, arr, dp);
        int notake = helper(i-1, arr, dp);

        return dp[i] = Math.max(take, notake);
    }
    public int rob(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);

        return helper(n-1, nums, dp);
    }
}