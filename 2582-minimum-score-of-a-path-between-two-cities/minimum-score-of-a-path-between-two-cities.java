class Solution {
    public int minScore(int n, int[][] roads) {
        int m=Integer.MAX_VALUE;

        List<List<int[]>> adj= new ArrayList<>();
        for(int i=0;i<=n;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] i:roads){
            adj.get(i[0]).add(new int[]{i[1], i[2]});
            adj.get(i[1]).add(new int[]{i[0], i[2]}); 
        }

        boolean[] vis= new boolean[n+1];
        vis[1]=true;
        Queue<Integer> q= new LinkedList<>();
        q.add(1);

        while(!q.isEmpty()){
            int a=q.poll();
            for(int[] i:adj.get(a)){
                int b=i[0];
                int c=i[1];

                m=Math.min(c,m);
                if(!vis[b]){
                    
                    vis[b]=true;
                    q.add(b);
                }
            }
        }
        return m;
    }
}