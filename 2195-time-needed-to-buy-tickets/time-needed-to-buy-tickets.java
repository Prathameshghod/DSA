class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<Integer> q= new LinkedList<>();
        int n=tickets.length;
        for(int i=0;i<n;i++){
            q.add(i);
        }
        int c=0;
        while(!q.isEmpty()){
            c++;
            int a=q.poll();
            tickets[a]--;
            if(k==a && tickets[a]==0){
                return c;
            }
            if(tickets[a]!=0){
                q.add(a);
            }
        }
        return c;
    }
}