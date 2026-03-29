    class Solution {
        public boolean dfs(ArrayList<ArrayList<Integer>> a,int node,boolean[] vis,boolean[] path){
            vis[node]=true;
            path[node]=true;
           for(int i : a.get(node)){
                if(!vis[i]){
                    if(dfs(a,i,vis,path)){
                        return true;
                    }
                }
                else if(path[i]){
                    return true;
                }
            }
            path[node]=false;
            return false;
        }
        public boolean isCyclic(int V, int[][] edges) {
            // code here
            boolean[] vis=new boolean[V];
            boolean[] path= new boolean[V];
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

            for(int i = 0; i < V; i++) {
                adj.add(new ArrayList<>());
            }
            
            for(int[] e : edges) {
                adj.get(e[0]).add(e[1]);
            }
            for(int i=0;i<V;i++){
                if(!vis[i]){
                    if(dfs(adj,i,vis,path)){
                        return true;
                    }
                }
            }
            return false;
        }
    }