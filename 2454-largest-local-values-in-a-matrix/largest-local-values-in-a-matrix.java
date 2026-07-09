class Solution {
    public int[][] largestLocal(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;

        int[][] a= new int[n-2][m-2];

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                a[i][j] = Math.max(grid[i][j], 
                            Math.max(grid[i][j+1], 
                            Math.max(grid[i][j+2], 
                            Math.max(grid[i+1][j], 
                            Math.max(grid[i+1][j+1], 
                            Math.max(grid[i+1][j+2], 
                            Math.max(grid[i+2][j], 
                            Math.max(grid[i+2][j+1], grid[i+2][j+2])
                          )))))));
            }
        }
        return a;
    }
}