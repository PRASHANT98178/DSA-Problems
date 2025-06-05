class Solution {

    public int helper(int i, int j, int[] arr, int[] dp){
        if(i > j) return 0;

        if(dp[i] != -1) return dp[i]; 
        int take = arr[i] + helper(i+2, j, arr, dp);
        int notake = helper(i+1, j, arr, dp);

        return dp[i] = Math.max(take, notake);
    }

    public int rob(int[] nums) {
        int n = nums.length;
        if(n==1) return nums[0];
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);

       int max1 = helper(0, n-2, nums, dp);

       Arrays.fill(dp, -1);
       int max2 = helper(1, n-1, nums, dp);

       return Math.max(max1, max2);
        
    }
}