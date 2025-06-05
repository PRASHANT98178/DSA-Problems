class Solution {
    
    static int helper(int i, int j, int[] arr, int[][] dp){
        if(i == j) return 0;
        
        
        int min = Integer.MAX_VALUE;
        
        if(dp[i][j] != -1) return dp[i][j];
        
        for(int k=i; k<j; k++){
            
            int left = helper(i, k, arr, dp);
            int right = helper(k+1, j, arr, dp);
            int temp = arr[i-1] * arr[k] * arr[j];
            
            int cost = left + right + temp;
            
            min = Math.min(cost, min);
        }
        return dp[i][j] = min;
    }
    
    static int matrixMultiplication(int arr[]) {
        int n = arr.length;
        int[][] dp = new int[n+1][n+1];
        
        for(int[] row : dp){
            Arrays.fill(row, -1);
        }
        
        return helper(1, n-1, arr, dp);
        
    }
}