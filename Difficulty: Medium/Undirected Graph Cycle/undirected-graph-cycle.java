class Solution {
    public boolean isCycle(int V, int[][] edges) {
        // Code here
        int n=edges.length;
        int m=edges[0].length;
        
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
      
        for(int i=0;i<n;i++){
                adj.get(edges[i][0]).add(edges[i][1]);
                adj.get(edges[i][1]).add(edges[i][0]);
        }
        
        boolean[] vis= new boolean[V];
        
        for(int j=0;j<V;j++){
            if(!vis[j]){
                Queue<int[]> q= new LinkedList<>();
                q.add(new int[]{j,-1});
                vis[j]=true;
                
                while(!q.isEmpty()){
                    int[] a=q.poll();
                    int node=a[0];
                    int parent=a[1];
                    
                    for(int i:adj.get(node)){
                        if(!vis[i]){
                            q.add(new int[]{i,node});
                            vis[i]=true;
                        }
                        else if(vis[i] && i 
                        !=parent){
                            return true;
                        }
                    }
                }
            }
            
        }
        
        return false;
    }
}