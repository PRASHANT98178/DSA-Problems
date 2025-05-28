class Solution {
    public int paths(int i, int j, int[][] arr, int[][] dp){
        if(i < 0 || j < 0 || arr[i][j] == 1) return 0;
        if(i == 0 && j == 0) return 1; 
        

        if(dp[i][j] != -1) return dp[i][j];
        int path1 = paths(i-1, j, arr, dp);
        int path2 = paths(i, j-1, arr, dp);
        return dp[i][j] = path1 + path2;
    }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int n = obstacleGrid.length;
        int m = obstacleGrid[0].length;
        int[][] dp = new int[n+1][m+1];
        for(int i=0; i<n; i++){
            Arrays.fill(dp[i], -1);
        }

        return paths(n-1, m-1, obstacleGrid, dp);
    }
}