/*
 * Problem Name: Dice_Combinations
 * Language: Java
 * Category: Dynamic_Programming
 * Date: 2026-08-02
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        if (input == null || input.trim().isEmpty()) return;
 
        int n = Integer.parseInt(input.trim());
        int MOD = 1_000_000_007;
 
        int[] dp = new int[n + 1];
        dp[0] = 1;
 
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 6; j++) {
                if (i - j >= 0) {
                    dp[i] = (dp[i] + dp[i - j]) % MOD;
                }
            }
        }
 
        System.out.println(dp[n]);
    }
}