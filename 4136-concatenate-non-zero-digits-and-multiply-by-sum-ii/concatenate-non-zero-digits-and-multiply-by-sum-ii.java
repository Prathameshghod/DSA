class Solution {
    public int[] sumAndMultiply(String s, int[][] queries) {
        int m = s.length();
        int n = queries.length;
        long MOD = 1000000007L;

        int[] b = new int[m];
        int[] a = new int[m];
        int[] f = new int[m];

        long sum = 0;
        long val = 0;
        int cnt = 0;

        for (int i = 0; i < m; i++) {
            int d = s.charAt(i) - '0';

            sum += d;
            a[i] = (int) sum;

            if (d != 0) {
                val = (val * 10 + d) % MOD;
                cnt++;
            }

            b[i] = (int) val;
            f[i] = cnt;
        }

        long[] pow = new long[cnt + 1];
        pow[0] = 1;
        for (int i = 1; i <= cnt; i++) {
            pow[i] = (pow[i - 1] * 10) % MOD;
        }

        int[] ans = new int[n];

        for (int k = 0; k < n; k++) {
            int l = queries[k][0];
            int r = queries[k][1];

            long digitSum = a[r] - (l > 0 ? a[l - 1] : 0);

            int nz = f[r] - (l > 0 ? f[l - 1] : 0);

            long x;
            if (l == 0) {
                x = b[r];
            } else {
                x = (b[r] - b[l - 1] * pow[nz]) % MOD;
                if (x < 0) x += MOD;
            }

            ans[k] = (int) ((x * digitSum) % MOD);
        }

        return ans;
    }
}