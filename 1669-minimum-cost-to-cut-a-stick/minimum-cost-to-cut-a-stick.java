import java.util.Arrays;

class Solution {
    public int minCost(int n, int[] cuts) {
        // 1. Create a new array that includes the stick boundaries (0 and n)
        int[] a = new int[cuts.length + 2];
        for (int i = 0; i < cuts.length; i++) {
            a[i] = cuts[i];
        }
        a[cuts.length] = 0;
        a[cuts.length + 1] = n;
        
        // 2. Sort the array so the cuts are in sequential order
        Arrays.sort(a);
        
        // 3. Initialize a memoization table to prevent recalculating subproblems
        Integer[][] dp = new Integer[a.length][a.length];
        
        // 4. Call the recursive function spanning the entire stick (indices 0 to a.length - 1)
        return solve(0, a.length - 1, a, dp);
    }
    
    private int solve(int i, int j, int[] a, Integer[][] dp) {
        // Base case: If there are no cuts to be made between index i and j
        if (j - i < 2) {
            return 0;
        }
        
        // Return cached result if already computed
        if (dp[i][j] != null) {
            return dp[i][j];
        }
        
        int min = Integer.MAX_VALUE;
        
        // Try making every possible cut 'k' between 'i' and 'j'
        for (int k = i + 1; k < j; k++) {
            // Cost is the current stick length (a[j] - a[i]) plus the cost of cutting the left and right segments
            int cost = (a[j] - a[i]) + solve(i, k, a, dp) + solve(k, j, a, dp);
            min = Math.min(min, cost);
        }
        
        // Cache and return the minimum cost found
        return dp[i][j] = min;
    }
}