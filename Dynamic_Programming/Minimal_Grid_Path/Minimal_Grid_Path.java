/*
 * Problem Name: Minimal_Grid_Path
 * Language: Java
 * Category: Dynamic_Programming
 * Date: 2026-08-04
 */

import java.io.*;
 
public class Main {
 
    static String[][] dp;
 
    public static String solve(char[][] a, int n, int r, int c) {
 
        if (r >= n || c >= n) {
            return "{";
        }
 
        if (r == n - 1 && c == n - 1) {
            return String.valueOf(a[r][c]);
        }
 
        if (dp[r][c] != null) {
            return dp[r][c];
        }
 
        String d = solve(a, n, r + 1, c);
        String rt = solve(a, n, r, c + 1);
 
        if (d.compareTo(rt) <= 0) {
            dp[r][c] = a[r][c] + d;
        } else {
            dp[r][c] = a[r][c] + rt;
        }
 
        return dp[r][c];
    }
 
    public static String func(char[][] a, int n) {
        dp = new String[n][n];
        return solve(a, n, 0, 0);
    }
 
    public static void main(String[] args) throws Exception {
 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        int n = Integer.parseInt(br.readLine());
 
        char[][] grid = new char[n][n];
 
        for (int i = 0; i < n; i++) {
            grid[i] = br.readLine().toCharArray();
        }
 
        System.out.println(func(grid, n));
    }
}