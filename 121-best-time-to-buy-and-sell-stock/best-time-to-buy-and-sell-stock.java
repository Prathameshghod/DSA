class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int i=0;
        int j=1;
        int max=0;
        while(j<n){
            if(prices[i]<prices[j]){
                max=Math.max(max,prices[j]-prices[i]);
            }
            else{
                i=j;
            }
            j++;
        }
        return max;
    }
}