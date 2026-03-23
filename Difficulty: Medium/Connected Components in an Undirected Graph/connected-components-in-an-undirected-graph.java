class Solution {
    public ArrayList<ArrayList<Integer>> getComponents(int V, int[][] edges) {
        // code here
         ArrayList<ArrayList<Integer>> adj= new ArrayList<>();
         for(int i=0;i<V;i++){
             adj.add(new ArrayList<>());
         }
         for(int i=0;i<edges.length;i++){
             adj.get(edges[i][0]).add(edges[i][1]);
              adj.get(edges[i][1]).add(edges[i][0]);
         }
         boolean[] vis= new boolean[V];
         
          ArrayList<ArrayList<Integer>> ans= new ArrayList<>();
          
          for(int i=0;i<V;i++){
              if(!vis[i]){
                  ArrayList<Integer> a= new ArrayList<>();
                  Queue<Integer> q= new LinkedList<>();
                  q.offer(i);
                  vis[i]=true;
                  while(!q.isEmpty()){
                      int b=q.poll();
                      a.add(b);
                      
                      for(int j:adj.get(b)){
                          if(!vis[j]){
                              vis[j]=true;
                              q.add(j);
                          }
                      }
                  }
                  ans.add(a);
              }
              
          }
          return ans;
    }
}