class Solution {
    public int numDistinct(String s, String t) {
        if (s == null || t == null) {
            return -1;
        }
        if (t.length() == 0) {
            return 1;
        }
        int M = s.length();
        int N = t.length();

        int[][] dp = new int[M + 1][N + 1];
        for (int i = 0; i <= M; i++) {
            dp[i][0] = 1;
        }

        for (int i = 1; i <= M; i++) {
            for (int j = 1; j <= N; j++) {
                if (s.charAt(i - 1) == t.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[M][N];
    }
}



