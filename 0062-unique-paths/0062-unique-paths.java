class Solution {
    public int uniquePaths(int r, int c) {
        int[][] memo = new int[r + 1][c + 1];
        for (int i = 0; i <= r; i++) {
            for (int j = 0; j <= c; j++) {
                memo[i][j] = -1;
            }
        }
        return helper(r, c, memo);
    }

    private int helper(int r, int c, int[][] memo) {
        if (r == 1 || c == 1) {
            return 1;
        }
        if (memo[r][c] != -1) {
            return memo[r][c]; 
        }
        memo[r][c] = helper(r - 1, c, memo) + helper(r, c - 1, memo);
        return memo[r][c];
    }
}
