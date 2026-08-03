class Solution {
    public boolean stoneGame(int[] piles) {
        int n = piles.length;
        int[][] dp = new int[n][n];
        for (int[] row : dp)
            Arrays.fill(row, Integer.MIN_VALUE);
        return solve(0, n - 1, piles, dp) > 0;
    }
    private int solve(int i, int j, int[] piles, int[][] dp) {
        if (i == j)
            return piles[i];
        if (dp[i][j] != Integer.MIN_VALUE)
            return dp[i][j];
        int left = piles[i] - solve(i + 1, j, piles, dp);
        int right = piles[j] - solve(i, j - 1, piles, dp);
        return dp[i][j] = Math.max(left, right);
    }
}