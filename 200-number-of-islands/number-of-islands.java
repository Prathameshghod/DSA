class Solution {
    public void dfs(char[][] a,int i,int j){
        if(i<0 || i>=a.length || j<0 || j>=a[0].length || a[i][j]!='1'){
            return;
        }
        a[i][j]='U';
        dfs(a,i+1,j);
        dfs(a,i-1,j);
        dfs(a,i,j+1);
        dfs(a,i,j-1);
    }
    public int numIslands(char[][] grid) {
        int r=grid.length;
        int c=grid[0].length;
        
        int count=0;

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]=='1'){
                    count++;
                    dfs(grid,i,j);
                }
            }
        }
        return count;
    }
}
   