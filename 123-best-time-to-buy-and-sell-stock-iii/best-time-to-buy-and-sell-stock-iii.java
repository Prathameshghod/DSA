class Solution {
    public int solve(int i,int buy,int cap,int[] a,int[][][] t){
        int n=a.length;
        if(i==n){
            return 0;
        }
        if(cap==0){
            return 0;
        }
        if(t[i][buy][cap]!=-1){
            return t[i][buy][cap];
        }
        if(buy==1){
            return t[i][buy][cap]=Math.max(solve(i+1,buy-1,cap,a,t)-a[i],solve(i+1,buy,cap,a,t));
        }
        else{
            return t[i][buy][cap]=Math.max(solve(i+1,buy+1,cap-1,a,t)+a[i],solve(i+1,buy,cap,a,t));
        }

    }
    public int maxProfit(int[] prices) {
        int[][][] t=new int[prices.length+1][2][3];
        for(int[][] i:t){
            for(int[] j:i){
                Arrays.fill(j,-1);
            }
        }
        return solve(0,1,2,prices,t);
    }
}