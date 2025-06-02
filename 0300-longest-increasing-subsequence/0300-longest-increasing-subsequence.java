class Solution {

     private int helper(int i, int previndex, int[] nums, int[][] dp) {
        if (i == nums.length) return 0;

        if (dp[i][previndex + 1] != -1) return dp[i][previndex + 1];
        int notTake = helper(i + 1, previndex, nums, dp);
        int take = 0;
        if (previndex == -1 || nums[i] > nums[previndex]) {
           take = 1 + helper(i + 1, i, nums, dp);
        }

        return dp[i][previndex + 1] = Math.max(take, notTake);
    }

    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[][] dp = new int[n][n + 1];
        for (int[] arr : dp) {
            Arrays.fill(arr, -1);
        }
        return helper(0, -1, nums, dp);
    }
}