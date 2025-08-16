class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int a=prices[0];
        int r=0;
        for (int i=1;i<n;i++){
            a=Math.min(a,prices[i]);
            r=Math.max(r,prices[i]-a);
        }
        return r;
    }
}