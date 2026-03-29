class Solution {
    public boolean dfs(ArrayList<ArrayList<Integer>> a,int node,boolean[] vis,boolean[] path,boolean[] check){
            vis[node]=true;
            path[node]=true;
           for(int i : a.get(node)){
                if(!vis[i]){
                    if(dfs(a,i,vis,path,check)){
                        return true;
                    }
                }
                else if(path[i]){
                    return true;
                }
            }
            path[node]=false;
            check[node]=true;
            return false;
        }
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int V=graph.length;
        boolean[] vis=new boolean[V];
            boolean[] path= new boolean[V];
            boolean[] check= new boolean[V];
            List<Integer> r= new ArrayList<>();
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

            for(int i = 0; i < V; i++) {
                adj.add(new ArrayList<>());
            }
            
             for(int i = 0; i < V; i++) {
            for(int nei : graph[i]) {
                adj.get(i).add(nei);
            }
        }
            for(int i=0;i<V;i++){
                if(!vis[i]){
                    dfs(adj,i,vis,path,check);
                }
            }
            for(int i=0;i<V;i++){
                if(check[i]){
                    r.add(i);
                }
            }
            return r;
    }
}

  