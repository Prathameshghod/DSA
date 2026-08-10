class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int[][][] t=new int[prices.length+1][2][3];
        for(int i=n-1;i>=0;i--){
            for(int j=1;j>=0;j--){
                for(int cap=2;cap>0;cap--){
                    if(j==1){
                        t[i][j][cap]=Math.max(t[i+1][j-1][cap]-prices[i],t[i+1][j][cap]);
                    }
                    else{
                        t[i][j][cap]=Math.max(t[i+1][j+1][cap-1]+prices[i],t[i+1][j][cap]);
                    }
                }
            }
        }
        return t[0][1][2];
    }
}