class Solution {
    public int orangesRotting(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;

        int[][] vis = new int[n][m];
        int c=0;
        Queue<int[]> q= new LinkedList<>();

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                    q.add(new int[]{i,j,0});
                    vis[i][j]=2;
                }
                else{
                    vis[i][j]=0;
                }
                if(grid[i][j]==1){
                    c++;
                }
            }
        }

        int[] row={0,-1,0,1};
        int[] col={-1,0,1,0};
        int cnt=0;
        int time=0;

        while(!q.isEmpty()){
            int[] a=q.poll();
            int ro=a[0];
            int co=a[1];
            int t=a[2];

            time=Math.max(t,time);

            for(int i=0;i<4;i++){
                int x=ro+row[i];
                int y=co+col[i];
                if(x>=0 && x<n && y>=0 && y<m && vis[x][y]==0 && grid[x][y]==1){
                    q.add(new int[]{x,y,t+1});
                    vis[x][y]=2;
                    cnt++;
                }
            }
        }
        if(c!=cnt){
            return -1;
        }
        return time;
    }
}