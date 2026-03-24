class Solution {
    public int findCircleNum(int[][] isConnected) {
        List<List<Integer>> adj= new ArrayList<>();
    
        int n=isConnected.length;
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(isConnected[i][j]==1 && i!=j){
                    adj.get(i).add(j);
                }
            }
        }
        boolean[] vis=new boolean[n];
        int c=0;
       for(int i = 0; i < n; i++){
            if(!vis[i]){
                dfs(adj, vis, i);
                c++;  
            }
        }
        return c;
    }
    public void dfs(List<List<Integer>> adj,boolean[] vis,int node){
        vis[node]=true;
        for(int i:adj.get(node)){
            if(!vis[i]){
                dfs(adj,vis,i);
            }
        }
    }
}