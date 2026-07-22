class Solution {
    public int makeConnected(int n, int[][] connections) {
        if(connections.length<n-1){
            return -1;
        }
        List<List<Integer>> adj= new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] i:connections){
            adj.get(i[0]).add(i[1]);
            adj.get(i[1]).add(i[0]);
        }
        boolean[] vis= new boolean[n];
        int c=0;
        for(int i=0;i<n;i++){
            if(!vis[i]){
                c++;
                dfs(i,adj,vis);
            }
        }
        return c-1;
    }
    public void dfs(int i,List<List<Integer>> adj,boolean[] vis){
        vis[i]=true;
        for(int j:adj.get(i)){
            if(!vis[j]){
                dfs(j,adj,vis);
            }
        }
    }
}