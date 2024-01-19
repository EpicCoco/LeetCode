class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int[][] dp = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                dp[i][j] = matrix[i][j];
            } //for
        } //for
        for (int i = matrix.length - 2; i >= 0; i--) {
            for (int j = 0; j < matrix[0].length; j++) {
                int min = dp[i][j] + dp[i + 1][j];
                if (j != 0) min = Math.min(min, dp[i][j] + dp[i + 1][j - 1]);
                if (j < matrix[0].length - 1) min = Math.min(min, dp[i][j] + dp[i + 1][j + 1]);
                dp[i][j] = min;
            } //for
        } //for
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < dp[0].length; i++) {
            min = Math.min(min, dp[0][i]);
        } //for
        return min;
    } //minFallingPathSum
} //Solution