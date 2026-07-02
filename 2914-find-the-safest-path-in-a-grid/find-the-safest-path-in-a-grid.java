class Solution {
    final int[][] d={{0,1},{0,-1},{1,0},{-1,0}};
   
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
                       
                        q.add(new int[]{x,y});
                    }
                }
            }
        }

        PriorityQueue<int[]> pq= new PriorityQueue<>((k,p)->p[2]-k[2]);
        pq.add(new int[]{0,0,a[0][0]});
        a[0][0]=-1;

        while(!pq.isEmpty()){
            int[] curr=pq.poll();
            if(curr[0]==n-1 && curr[1]==n-1){
                return curr[2];
            }
            for(int[] i:d){
                int x=i[0]+curr[0];
                int y=i[1]+curr[1];

                if(x>=0 && x<n && y>=0 && y<n && a[x][y]!=-1){
                    pq.add(new int[]{x,y,Math.min(a[x][y],curr[2])});
                    a[x][y] =-1;
                }
            }
        }
        
        
        return -1;
    }
}