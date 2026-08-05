class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int n=obstacleGrid.length;
        int m=obstacleGrid[0].length;
        if (obstacleGrid[0][0] == 1 || obstacleGrid[n - 1][m- 1] == 1) {
            return 0;
        }

        int[][] t= new int[n][m];
        t[0][0]=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(obstacleGrid[i][j]==1){
                    t[i][j]=0;
                    continue;
                }
                if(i>0){
                    t[i][j]+=t[i-1][j];
                }
                if(j>0){
                    t[i][j]+=t[i][j-1];
                }
            }
        }
        return t[n-1][m-1];
    }
}