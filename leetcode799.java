class Solution {
    public double champagneTower(int poured, int query_row, int query_glass) {
       double[][] dp = new double[101][101];

        // Pour champagne into top glass
        dp[0][0] = poured;

        // Fill rows up to query_row
        for (int row = 0; row <= query_row; row++) {
            for (int glass = 0; glass <= row; glass++) {

                // If current glass overflows
                if (dp[row][glass] > 1.0) {
                    double overflow = (dp[row][glass] - 1.0) / 2.0;

                    dp[row + 1][glass] += overflow;
                    dp[row + 1][glass + 1] += overflow;

                    dp[row][glass] = 1.0; // Cap at 1
                }
            }
        }

        // Return min of 1 and value in queried glass
        return Math.min(1.0, dp[query_row][query_glass]);
    }}
