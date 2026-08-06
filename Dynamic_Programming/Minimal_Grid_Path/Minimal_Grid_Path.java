/*
 * Problem Name: Minimal_Grid_Path
 * Language: Java
 * Category: Dynamic_Programming
 * Date: 2026-08-06
 */

import java.io.*;
 
public class Main {
 
    public static String func(char[][] a, int n) {
        String[][] dp = new String[n][n];
 
        // 1. Base case: bottom-right corner
        dp[n - 1][n - 1] = String.valueOf(a[n - 1][n - 1]);
 
        // 2. Fill the DP table bottom-up (from bottom-right to top-left)
        for (int r = n - 1; r >= 0; r--) {
            for (int c = n - 1; c >= 0; c--) {
                // Skip the destination cell as it's already initialized
                if (r == n - 1 && c == n - 1) continue;
 
                String down = (r + 1 < n) ? dp[r + 1][c] : "{";
                String right = (c + 1 < n) ? dp[r][c + 1] : "{";
 
                // Pick the lexicographically smaller path string
                if (down.compareTo(right) <= 0) {
                    dp[r][c] = a[r][c] + down;
                } else {
                    dp[r][c] = a[r][c] + right;
                }
            }
        }
 
        // 3. Result is at the starting position (0, 0)
        return dp[0][0];
    }
 
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        int n = Integer.parseInt(br.readLine().trim());
 
        char[][] grid = new char[n][n];
 
        for (int i = 0; i < n; i++) {
            grid[i] = br.readLine().trim().toCharArray();
        }
 
        System.out.println(func(grid, n));
    }
}