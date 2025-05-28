class Solution {
    public int paths(int m, int n, int[][] dp){
        if(m == 0 && n == 0){
            return 1;
        }
        if(m<0 || n<0) return 0;

        if(dp[m][n]  != -1) return dp[m][n];
        int path1 = paths(m-1, n, dp);  
        int path2 = paths(m, n-1, dp);

        return dp[m][n] = path1 + path2;
    }
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m+1][n+1];
        for(int i=0; i<dp.length; i++){
            for(int j=0; j<dp[0].length; j++){
                dp[i][j] = -1;
            }
        }
        return paths(m-1, n-1, dp);
        //  dp[m-1][n-1];
    }
}