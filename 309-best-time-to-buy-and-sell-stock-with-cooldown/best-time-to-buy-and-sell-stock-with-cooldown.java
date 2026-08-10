class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int[][] t=new int[n+2][2];
        t[n][0]=0;
        t[n][1]=0;
        for(int i=n-1;i>=0;i--){
            for(int j=1;j>=0;j--){
                if(j==1){
                    t[i][j]=Math.max(t[i+1][j-1]-prices[i],t[i+1][j]);
                }
                else{
                    t[i][j]=Math.max(t[i+2][j+1]+prices[i],t[i+1][j]);
                }
            }
        }
        return t[0][1];
    }
}