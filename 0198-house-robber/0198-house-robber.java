class Solution {
    public static int helper(int i, int[] arr, int[] dp){
        if(i<0) return 0;
        if(dp[i] != -1) return dp[i];
        int take = arr[i] + helper(i-2, arr, dp);
        int nottake = helper(i-1, arr, dp);

        return dp[i] = Math.max(take, nottake);
    }
    public int rob(int[] nums) {
        int[] dp = new int[nums.length+1];
        Arrays.fill(dp, -1);
        int ans = helper(nums.length-1, nums, dp);
        return ans;
    }
}