class Solution {
    public String shortestCommonSupersequence(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();
        int[][] t = new int[n + 1][m + 1];
        
        // 1. Build the LCS Table
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    t[i][j] = 1 + t[i - 1][j - 1];
                } else {
                    t[i][j] = Math.max(t[i - 1][j], t[i][j - 1]);
                }
            }
        }
        
        // 2. Backtrack to find the Shortest Common Supersequence
        int i = n, j = m;
        StringBuilder sb = new StringBuilder();
        
        while (i > 0 && j > 0) {
            // If characters match, they are part of the LCS. Add once and move diagonally.
            if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                sb.append(str1.charAt(i - 1));
                i--;
                j--;
            } 
            // If they don't match, move in the direction of the larger value in the DP table.
            // Add the character of the string we are moving away from.
            else if (t[i - 1][j] > t[i][j - 1]) {
                sb.append(str1.charAt(i - 1));
                i--;
            } else {
                sb.append(str2.charAt(j - 1));
                j--;
            }
        }
        
        // 3. Add any remaining characters from str1
        while (i > 0) {
            sb.append(str1.charAt(i - 1));
            i--;
        }
        
        // 4. Add any remaining characters from str2
        while (j > 0) {
            sb.append(str2.charAt(j - 1));
            j--;
        }
        
        // 5. We built the string backwards, so reverse it before returning
        return sb.reverse().toString();
    }
}