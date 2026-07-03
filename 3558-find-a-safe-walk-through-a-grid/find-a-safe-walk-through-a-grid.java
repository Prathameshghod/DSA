class Solution {
    public boolean findSafeWalk(List<List<Integer>> grid, int health) {
        int n=grid.size();
        int m=grid.get(0).size();
        
        int[][] a= new int[n][m];
        for(int[] i:a){
            Arrays.fill(i,-1);
        }
        PriorityQueue<int[]> pq= new PriorityQueue<>((k,l)->k[0]-l[0]);
        pq.add(new int[]{grid.get(0).get(0),0,0});
        int[][] d={{0,1},{0,-1},{1,0},{-1,0}};

        while(!pq.isEmpty()){
            int[] b=pq.poll();
            int x=b[0];
            int y=b[1];
            int z=b[2];
            
            if(a[y][z]>=0){
                continue;
            }
            a[y][z]=x;

            for(int[] i:d){
                int p=y+i[0];
                int q=z+i[1];
                if(p<0 || q<0 || p>=n || q>=m){
                    continue;
                }
                if(a[p][q]>=0){
                    continue;
                }
                pq.add(new int[]{x+grid.get(p).get(q),p,q});
            }
        }
        return a[n-1][m-1]<health;
        
    }
}