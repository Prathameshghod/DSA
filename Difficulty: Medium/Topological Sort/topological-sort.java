class Solution {
    public void dfs(ArrayList<ArrayList<Integer>> adj,boolean[] vis,int i,Stack<Integer> s){
        vis[i]=true;
        for(int j:adj.get(i)){
            if(!vis[j]){
                dfs(adj,vis,j,s);
            }
        }
        s.add(i);
    }
    public ArrayList<Integer> topoSort(int V, int[][] edges) {
        // code here
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        
        for(int[] e:edges){
            adj.get(e[0]).add(e[1]);
        }
        
        boolean[] vis=new boolean[V];
        Stack<Integer> s=new Stack<>();
        
        for(int i=0;i<V;i++){
            if(!vis[i]){
                dfs(adj,vis,i,s);
            }
        }
        ArrayList<Integer> r= new ArrayList<>();
        for(int i=0;i<V;i++){
            r.add(s.pop());
        }
        return r;
    }
}