class Solution {
    public static int helper(int n, int[] dp){
        if(n==1 || n==0){
            return 1;
        }
        if(dp[n] != -1) return dp[n];
        int step1 = helper(n-1, dp);
        int step2 = helper(n-2, dp);

        return dp[n] = step1 + step2;
    }
    public int climbStairs(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);

        return helper(n, dp);
    }
}