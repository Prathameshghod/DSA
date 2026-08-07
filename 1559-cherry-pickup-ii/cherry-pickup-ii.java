class Solution {

    int n;
    int m;

    int [][][] dp;
    public int cherryPickup(int[][] grid) {
       n = grid.length;
       m = grid[0].length;

       dp = new int [n][m][m];

       for(int [][]arr:dp){
        for(int [] nums:arr){
            Arrays.fill(nums,-1);
        }
       }


       return (solve(0,0,m-1,grid));
        
    }

    int solve(int r,int c1,int c2,int[][] grid){

        if(c1<0 || c2<0 ||   c1>=m || c2>=m) return Integer.MIN_VALUE;

       

        if(r==n-1){
            
            if(c1==c2) return grid[r][c1];

            return grid[r][c1] + grid[r][c2];
        }

         if(dp[r][c1][c2] !=-1) return dp[r][c1][c2];
        


        int max = Integer.MIN_VALUE;

        for(int i=-1;i<=1;i++){
            for(int j=-1;j<=1;j++){
                max = Math.max(max,solve(r+1,c1+i,c2+j,grid));
            }
        }

        int curr;

        if(c1==c2){
            curr = grid[r][c1];
        }else{
            curr = grid[r][c1] + grid[r][c2];
        }
      

      return dp[r][c1][c2] = curr + max;


    }
}