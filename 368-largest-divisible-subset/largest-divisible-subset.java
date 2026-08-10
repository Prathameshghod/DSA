class Solution {
    public List<Integer> largestDivisibleSubset(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;

        int[] dp = new int[n];
        int[] parent = new int[n];

        Arrays.fill(dp, 1);

        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }

        int maxLen = 1;
        int lastIndex = 0;

        // DP
        for (int i = 0; i < n; i++) {

            for (int prev = 0; prev < i; prev++) {

                if (arr[i] % arr[prev]==0 &&
                    dp[i] < 1 + dp[prev]) {

                    dp[i] = 1 + dp[prev];

                    // Store previous element's index
                    parent[i] = prev;
                }
            }

            if (dp[i] > maxLen) {
                maxLen = dp[i];
                lastIndex = i;
            }
        }

        // Construct LIS
        ArrayList<Integer> ans = new ArrayList<>();

        while (parent[lastIndex] != lastIndex) {
            ans.add(arr[lastIndex]);
            lastIndex = parent[lastIndex];
        }

        ans.add(arr[lastIndex]);

        Collections.reverse(ans);

        return ans;        
    }
}