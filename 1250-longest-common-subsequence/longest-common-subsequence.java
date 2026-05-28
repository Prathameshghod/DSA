class Solution {
    public int lcs(int i,int j,String a,String b,int[][] dp){
        if(i<0 || j<0){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(a.charAt(i)==b.charAt(j)){
            return dp[i][j]=1+lcs(i-1,j-1,a,b,dp);
        }
        return dp[i][j]= Math.max(lcs(i-1,j,a,b,dp),lcs(i,j-1,a,b,dp));
    }
    public int longestCommonSubsequence(String text1, String text2) {
        int n=text1.length();
        int m=text2.length();
        int[][] dp= new int[n][m];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        return lcs(n-1,m-1,text1,text2,dp);
    }
}