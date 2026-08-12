class Solution {

    public static int leftlis(int idx, int prev, int[] a, int[][] t) {

        if (idx < 0) {
            return 0;
        }

        if (t[idx][prev] != -1) {
            return t[idx][prev];
        }

        int take = 0;

        if (a[idx] < a[prev]) {
            take = 1 + leftlis(idx - 1, idx, a, t);
        }

        int skip = leftlis(idx - 1, prev, a, t);

        return t[idx][prev] = Math.max(take, skip);
    }

    public static int rightlds(int idx, int next, int[] a, int[][] t) {

        if (idx >= a.length) {
            return 0;
        }

        if (t[idx][next] != -1) {
            return t[idx][next];
        }

        int take = 0;

        if (a[idx] < a[next]) {
            take = 1 + rightlds(idx + 1, idx, a, t);
        }

        int skip = rightlds(idx + 1, next, a, t);

        return t[idx][next] = Math.max(take, skip);
    }

    public int minimumMountainRemovals(int[] nums) {
        int n=nums.length;
        int max = 0;

        int[][] t1 = new int[n][n];
        int[][] t2 = new int[n][n];

        for (int i = 0; i < n; i++) {
            Arrays.fill(t1[i], -1);
            Arrays.fill(t2[i], -1);
        }

        for (int i = 1; i < n - 1; i++) {

            int l = leftlis(i - 1, i, nums, t1);
            int r = rightlds(i + 1, i, nums, t2);

            if (l > 0 && r > 0) {
                max = Math.max(max, l + r + 1);
            }
        }

        return n-max;
    }
}