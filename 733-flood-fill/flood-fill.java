class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int n=image.length;
        int m=image[0].length;
        int a=image[sr][sc];
        if(a==color){
            return image;
        }
        image[sr][sc]=color;

        Queue<int[]> q= new LinkedList<>();
        q.add(new int[]{sr,sc});

        int[] r={0,-1,0,1};
        int[] c={-1,0,1,0};
        while(!q.isEmpty()){
            int[] b=q.poll();
            int row=b[0];
            int col=b[1];
            for(int i=0;i<4;i++){
                int x=row+r[i];
                int y=col+c[i];
                if(x>=0 && x<n && y>=0 && y<m && image[x][y]==a){
                    image[x][y]=color;
                    q.add(new int[]{x,y});
                }
            }
        }
        
        return image;
    }
}