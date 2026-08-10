class Solution {
    public int solve(int i,int buy,int[] a,int[][] t){
        int n=a.length;
        if(i==n){
            return 0;
        }
        if(t[i][buy]!=-1){
            return t[i][buy];
        }
        if(buy==1){
            return t[i][buy]=Math.max(solve(i+1,buy-1,a,t)-a[i],solve(i+1,buy,a,t));
        }
        else{
            return t[i][buy]=Math.max(solve(i+1,buy+1,a,t)+a[i],solve(i+1,buy,a,t));
        }

    }
    public int maxProfit(int[] prices) {
        int[][] t=new int[prices.length+1][2];
        for(int[] i:t){
            Arrays.fill(i,-1);
        }
        return solve(0,1,prices,t);
    }
}