    class Solution {
        public int solve(String a, String b, int n, int m,int[][] t) {
            if (n == 0) {
                return m;
            }

            if (m == 0) {
                return n;
            }
            if(t[n][m]!=-1){
                return t[n][m];
            }
            if (a.charAt(n - 1) == b.charAt(m - 1)) {
                return t[n][m]=solve(a, b, n - 1, m - 1,t);
            }

            int insert = solve(a, b, n, m - 1,t);
            int delete = solve(a, b, n - 1, m,t);
            int replace = solve(a, b, n - 1, m - 1,t);

            return t[n][m]=1 + Math.min(insert, Math.min(delete, replace));
        }

        public int minDistance(String word1, String word2) {
            int n = word1.length();
            int m = word2.length();
            int[][] t= new int[n+1][m+1];
            for(int[] i:t){
                Arrays.fill(i,-1);
            }
            return solve(word1, word2, n, m,t);
        }
    }