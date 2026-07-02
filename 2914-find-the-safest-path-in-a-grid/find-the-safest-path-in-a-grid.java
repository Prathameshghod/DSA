class Solution {
    final int[][] d={{0,1},{0,-1},{1,0},{-1,0}};
    public boolean isvalid(int[][] a,int b){
        int n=a.length;
        if(a[0][0]<b || a[n-1][n-1]<b){
            return false;
        }
        
        Queue<int[]> q= new LinkedList<>();
        q.add(new int[]{0,0});
        boolean[][] vis=new boolean[n][n];
        vis[0][0]=true;

        while(!q.isEmpty()){
            int[] curr=q.poll();
            if(curr[0]==n-1 && curr[1]==n-1){
                return true;
            }
            for(int[] i:d){
                int x=i[0]+curr[0];
                int y=i[1]+curr[1];

                if(x>=0 && x<n && y>=0 && y<n && vis[x][y]!=true && a[x][y]>=b){
                    vis[x][y] =true;
                    q.add(new int[]{x,y});
                }
            }
        }
        return false;
    }
    public int maximumSafenessFactor(List<List<Integer>> grid) {
        int n=grid.size();
        
        int[][] a= new int[n][n];
       for (int[] row : a) {
            Arrays.fill(row, -1);
        }

        Queue<int[]> q= new LinkedList<>();

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(grid.get(i).get(j)==1){
                    q.add(new int[]{i,j});
                    a[i][j]=0;
                }
            }
        }
        int r=0;
        while(!q.isEmpty()){
            int m=q.size();
            while(m-->0){
                int[] b=q.poll();
                for(int[] i:d){
                    int x=b[0]+i[0];
                    int y=b[1]+i[1];

                    int z=a[b[0]][b[1]];
                    if(x>=0 && x<n && y>=0 && y<n && a[x][y]==-1){
                        a[x][y]=z+1;
                        r=Math.max(r,a[x][y]);
                        q.add(new int[]{x,y});
                    }
                }
            }
        }
        
        int l=0;
        int c=0;

        while(l<=r){
            int m=l+(r-l)/2;

            if(isvalid(a,m)){
                c=m;
                l=m+1;
            }
            else{
                r=m-1;
            }
        }
        return c;
    }
}