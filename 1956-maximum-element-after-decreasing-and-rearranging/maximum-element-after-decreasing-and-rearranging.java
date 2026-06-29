class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        int n = arr.length;
        int[] a = new int[n + 1];

        for (int x : arr) {
            a[Math.min(x, n)]++;
        }

        int j = 1;
        int r = 1;
        int i = 1;

        while (j <= n && i <= n) {
            while (a[i] > 0 && j <= i && j <= n) {
                a[i]--;
                r = j;
                j++;
            }
            i++;
        }

        return r;
    }
}