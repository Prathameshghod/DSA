class Solution {
    public int countCompleteComponents(int n, int[][] edges) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            adj.get(edges[i][0]).add(edges[i][1]);
            adj.get(edges[i][1]).add(edges[i][0]);
        }

        int c=0;
        boolean[] vis= new boolean[n];

        for(int i=0;i<n;i++){
            if(!vis[i]){
                Queue<Integer> q= new LinkedList<>();
                List<Integer> a= new ArrayList<>();
                q.add(i);

                while(!q.isEmpty()){
                    int b=q.poll();
                    vis[b]=true;
                    a.add(b);

                    for(int j:adj.get(b)){
                        if(!vis[j]){
                            vis[j]=true;
                            q.add(j);
                        }
                    }
                }
                boolean d=true;
                for(int k:a){
                    if(adj.get(k).size() !=a.size()-1){
                        d=false;
                        break;
                    }
                }
                if(d){
                    c++;
                }
                
            }
        }
        return c;
    }
}