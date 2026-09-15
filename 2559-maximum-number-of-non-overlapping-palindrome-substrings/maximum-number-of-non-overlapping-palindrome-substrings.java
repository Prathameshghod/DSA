class Solution {
    private Integer[] memo;

    public int maxPalindromes(String s, int k) {
        memo = new Integer[s.length()];
        return helper(s, 0, k);
    }

    private int helper(String s, int i, int k) {
        if (i + k > s.length()) {
            return 0;
        }
        if (memo[i] != null) {
            return memo[i];
        }

        int ans = helper(s, i + 1, k);

        if (isPalindrome(s, i, i + k - 1)) {
            ans = Math.max(ans, 1 + helper(s, i + k, k));
        }

        if (i + k < s.length() && isPalindrome(s, i, i + k)) {
            ans = Math.max(ans, 1 + helper(s, i + k + 1, k));
        }

        return memo[i] = ans;
    }

    private boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left++) != s.charAt(right--)) {
                return false;
            }
        }
        return true;
    }
}