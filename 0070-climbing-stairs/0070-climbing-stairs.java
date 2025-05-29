class Solution {
    public int helper(int n, int[] dp){
        if(n==0) return 1;
        if(n==1) return 1;

        if(dp[n] != -1) return dp[n];
        int op1 = helper(n-1, dp);
        int op2 = helper(n-2, dp);

        return dp[n] = op1 + op2;
    }
    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        return helper(n, dp);
    }
}