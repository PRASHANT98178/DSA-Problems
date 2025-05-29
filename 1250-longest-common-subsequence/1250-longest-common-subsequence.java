public class Solution {
    public int helper(int i, int j, String s, String t, int[][] dp) {
        if (i >= s.length() || j >= t.length()) return 0;

        if (dp[i][j] != -1) return dp[i][j];

        if (s.charAt(i) == t.charAt(j)) {
            dp[i][j] = 1 + helper(i + 1, j + 1, s, t, dp);
        } 
        else {
            dp[i][j] = Math.max(helper(i + 1, j, s, t, dp), helper(i, j + 1, s, t, dp));
        }

        return dp[i][j];
    }

    public int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();
        int[][] dp = new int[m+1][n+1];

       
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = -1;
            }
        }

        return helper(0, 0, text1, text2, dp);
    }
}
