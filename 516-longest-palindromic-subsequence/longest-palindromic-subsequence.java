class Solution {
    public int longestPalindromeSubseq(String s) {
        int[][] dp= new int[s.length()][s.length()];
        for(int i=0;i<s.length();i++){
            Arrays.fill(dp[i],-1);
        }
        return Helper(s,0,s.length()-1,dp);
    }

    public int Helper(String s,int i,int j,int [][] dp){
        if(i>j){
            return 0;
        }
        if(i==j){
            return 1;
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        if(s.charAt(i)==s.charAt(j)){
            return dp[i][j]=2+Helper(s,i+1,j-1,dp);
        }
        return dp[i][j]=Math.max(Helper(s,i+1,j,dp),Helper(s,i,j-1,dp));

    }
}