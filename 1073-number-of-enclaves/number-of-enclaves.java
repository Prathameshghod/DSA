class Solution {
    
    public void dfs(int[][] a,int i,int j){
        if(i<0 || i>=a.length || j<0 || j>=a[0].length || a[i][j]!=1){
            return;
        }
        a[i][j]=2;
        dfs(a,i,j-1);
        dfs(a,i-1,j);
        dfs(a,i,j+1);
        dfs(a,i+1,j);
    }

    public int numEnclaves(int[][] grid) {
        int r=grid.length;
        int c=grid[0].length;

        for(int i=0;i<c;i++){
            dfs(grid,0,i);

            dfs(grid,r-1,i);
        }
        for(int i=1;i<r-1;i++){
            dfs(grid,i,0);

            dfs(grid,i,c-1);
        }
        return convert(grid,r,c);
    }
     public int convert(int[][] grid,int r,int c){
        int x=0;
         for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){

                if(grid[i][j]==1){
                    x++;
                }
            }
        }
        return x;
     }
}
