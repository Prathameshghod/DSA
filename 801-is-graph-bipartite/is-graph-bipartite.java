class Solution {

    public int[] vis;

    public boolean dfs(int[][] a,int idx,int c){
        vis[idx]=c;
        for(int i:a[idx]){
            if(vis[i]==-1){
                if(!dfs(a,i,1-c)){
                    return false;
                }
            }
            else if(vis[i]==c){
                return false;
            }
        }
        return true;
    }
    public boolean isBipartite(int[][] graph) {
        int n=graph.length;
        vis= new int[n];
        Arrays.fill(vis,-1);
        for(int i=0;i<n;i++){
            if(vis[i]==-1){
                if(!dfs(graph,i,0)){
                    return false;
                }  
            }
        }
        return true;
    }
}