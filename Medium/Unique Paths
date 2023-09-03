class Solution {
    public int uniquePaths(int m, int n) {
        // Create a 2D DP array filled with zeros
        int[][] dp = new int[m][n];
        
        // Initialize the rightmost column and bottom row to 1
        for (int i = 0; i < m; i++) {
            dp[i][n-1] = 1;
        }
        for (int j = 0; j < n; j++) {
            dp[m-1][j] = 1;
        }
        
        // Fill in the DP array bottom-up
        for (int i = m - 2; i >= 0; i--) {
            for (int j = n - 2; j >= 0; j--) {
                dp[i][j] = dp[i+1][j] + dp[i][j+1];
            }
        }
        
        // Return the result stored in the top-left corner
        return dp[0][0];
    }
}
