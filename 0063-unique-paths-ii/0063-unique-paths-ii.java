class Solution {
    public int uniquePathsWithObstacles(int[][] arr) {
        if (arr[arr.length - 1][arr[0].length - 1] == 1 || arr[0][0] == 1)
            return 0;
        int dp[][]=new int[arr.length][arr[0].length];
        dp[0][0]=1;
        for (int i = 1; i < dp.length; i++) {
            if (arr[i][0] == 0) {
                dp[i][0] = dp[i - 1][0];
            }
        }
        for (int j = 1; j < dp[0].length; j++) {
            if (arr[0][j] == 0) {
                dp[0][j] = dp[0][j - 1];
            }
        }
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[i].length; j++) {
                if (arr[i][j] == 1) {
                    dp[i][j] = 0;
                } else {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                }
            }
        }
        return dp[dp.length - 1][dp[0].length - 1];
    }
}