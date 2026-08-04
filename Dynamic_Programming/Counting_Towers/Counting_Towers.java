/*
 * Problem Name: Counting_Towers
 * Language: Java
 * Category: Dynamic_Programming
 * Date: 2026-08-04
 */

import java.io.*;
 
public class Main {
 
    static final int MOD = 1_000_000_007;
 
    public static void main(String[] args) throws Exception {
 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        int tc = Integer.parseInt(br.readLine());
 
        int[] q = new int[tc];
        int max = 0;
 
        for (int i = 0; i < tc; i++) {
            q[i] = Integer.parseInt(br.readLine());
            max = Math.max(max, q[i]);
        }
 
        long[][] dp = new long[max + 1][2];
 
        dp[1][0] = 1;
        dp[1][1] = 1;
 
        for (int i = 2; i <= max; i++) {
            dp[i][0] = (4 * dp[i - 1][0] + dp[i - 1][1]) % MOD;
            dp[i][1] = (dp[i - 1][0] + 2 * dp[i - 1][1]) % MOD;
        }
 
        StringBuilder sb = new StringBuilder();
 
        for (int i = 0; i < tc; i++) {
            int n = q[i];
            sb.append((dp[n][0] + dp[n][1]) % MOD).append("\n");
        }
 
        System.out.print(sb);
    }
}