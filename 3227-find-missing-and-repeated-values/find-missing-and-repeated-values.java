class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {

        long n = grid.length;
        long c = n * n;

        long S = (c * (c + 1)) / 2;
        long S2 = (c * (c + 1) * (2 * c + 1)) / 6;

        long s = 0;
        long s2 = 0;

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                s += grid[i][j];
                s2 += (long)grid[i][j] * grid[i][j];
            }
        }

        long A = s - S;         
        long B = (s2 - S2) / A;  

        long x = (A + B) / 2;    
        long y = x - A;         

        return new int[]{(int)x, (int)y};
    }
}