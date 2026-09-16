import java.util.Arrays;

class Solution {
    private static final int MOD = 1_000_000_007;
    private Integer[][][] memo;

    public int numberOfSets(int n, int k) {
        // memo[i][k][is_open]
        memo = new Integer[n][k + 1][2];
        return solve(0, k, 0, n);
    }

    private int solve(int i, int k, int isOpen, int n) {
        // Base case: all k segments successfully placed
        if (k == 0) {
            return 1;
        }
        // Base case: reached or exceeded point boundary without completing k segments
        if (i >= n) {
            return 0;
        }

        if (memo[i][k][isOpen] != null) {
            return memo[i][k][isOpen];
        }

        long ways = 0;

        if (isOpen == 0) {
            // Option 1: Skip point i
            ways = (ways + solve(i + 1, k, 0, n)) % MOD;
            // Option 2: Start a new segment at point i
            ways = (ways + solve(i + 1, k, 1, n)) % MOD;
        } else {
            // Option 1: Continue/extend the current segment past point i
            ways = (ways + solve(i + 1, k, 1, n)) % MOD;
            // Option 2: End the current segment at point i.
            // Notice we stay at index i because adjacent segments can share endpoints.
            ways = (ways + solve(i, k - 1, 0, n)) % MOD;
        }

        return memo[i][k][isOpen] = (int) ways;
    }
}