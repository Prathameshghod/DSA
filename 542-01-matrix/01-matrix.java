class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;

        Queue<int[]> q= new LinkedList<>();

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==0){
                    q.add(new int[]{i,j});
                }
                else{
                    mat[i][j]=-1;
                }
            }
        }
        int[] r={0,-1,0,1};
        int[] c={-1,0,1,0};
        while(!q.isEmpty()){
            int[] a=q.poll();
            int row=a[0];
            int col=a[1];
            int cnt=0;
            for(int i=0;i<4;i++){
                int x=row+r[i];
                int y=col+c[i];
                if(x>=0 && x<n && y>=0 && y<m && mat[x][y]==-1){
                    mat[x][y]=mat[row][col]+1;
                     q.add(new int[]{x,y});
                }
            }
        }
        return mat;
    }
}