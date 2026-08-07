class Solution {
    public int solve(int[][] a,int r,int c1,int c2,int[][][] t){
        int n=a.length;
        int m=a[0].length;

        if(c1<0 || c1>=m || c2<0 || c2>=m){
            return -1000000;
        }
        if(r==n){
            return 0;
        }
        if(t[r][c1][c2]!=-1){
            return t[r][c1][c2];
        }
        int c=0;
        if(c1==c2){
            c=a[r][c1];
        }
        else{
            c=a[r][c1]+a[r][c2];
        }
        int best=0;
        for(int i=-1;i<=1;i++){
            for(int j=-1;j<=1;j++){
                best=Math.max(best,solve(a,r+1,c1+i,c2+j,t));
            }
        }
        return t[r][c1][c2]=best+c;
    }
    public int cherryPickup(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int[][][] t= new int[n+1][m+1][m+1];
        for(int[][] i:t){
            for(int[] j: i){
                Arrays.fill(j,-1);
            }
        }
        return solve(grid,0,0,m-1,t);
    }
}