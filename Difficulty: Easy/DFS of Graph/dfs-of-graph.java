class Solution {
    public void dfs_traversal(ArrayList<Integer> a,boolean[] vis,int node,ArrayList<ArrayList<Integer>> adj){
        vis[node]=true;
        a.add(node);
        
        for(int i:adj.get(node)){
            if(!vis[i]){
                dfs_traversal(a,vis,i,adj);
            }
        }
    }
    
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
         ArrayList<Integer> a= new  ArrayList<>();
         boolean[] vis= new boolean[adj.size()];
         vis[0]=true;
         dfs_traversal(a,vis,0,adj);
         return a;
    }
}