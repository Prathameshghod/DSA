import java.util.Arrays;

class Solution {
    public int f(int[][] a, int r1, int c1, int r2, Integer[][][] dp) {
        int n = a.length;
        int c2 = r1 + c1 - r2;

        // Out of bounds check
        if (r1 >= n || c1 >= n || r2 >= n || c2 >= n) {
            return -1000000;
        }

        // Thorn/blocked cell check
        if (a[r1][c1] == -1 || a[r2][c2] == -1) {
            return -1000000;
        }

        // Reached destination (n-1, n-1)
        if (r1 == n - 1 && c1 == n - 1) {
            return a[r1][c1];
        }

        // Return memoized result if already computed
        if (dp[r1][c1][r2] != null) {
            return dp[r1][c1][r2];
        }

        // Collect cherries from current positions
        int c = 0;
        if (r1 == r2 && c1 == c2) {
            c = a[r1][c1]; // Both at the same cell, pick cherry once
        } else {
            c = a[r1][c1] + a[r2][c2]; // Pick from both distinct cells
        }

        // Explore all 4 possible move combinations:
        // 1. Person 1 Down,  Person 2 Down
        // 2. Person 1 Down,  Person 2 Right
        // 3. Person 1 Right, Person 2 Down
        // 4. Person 1 Right, Person 2 Right
        int best = Math.max(
            f(a, r1 + 1, c1, r2 + 1, dp),
            Math.max(
                f(a, r1 + 1, c1, r2, dp),
                Math.max(
                    f(a, r1, c1 + 1, r2 + 1, dp),
                    f(a, r1, c1 + 1, r2, dp)
                )
            )
        );

        return dp[r1][c1][r2] = c + best;
    }

    public int cherryPickup(int[][] grid) {
        int n = grid.length;
        Integer[][][] dp = new Integer[n][n][n];
        
        int result = f(grid, 0, 0, 0, dp);
        return Math.max(0, result);
    }
}