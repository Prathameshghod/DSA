class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int curr = tickets[k];
        int ans=0;

        for(int i=0; i<tickets.length; i++){
            if(i<=k){
                ans += Math.min(curr, tickets[i]);
            }else{
                ans += Math.min(curr-1, tickets[i]);
            }
        }

        return ans;
    }
}