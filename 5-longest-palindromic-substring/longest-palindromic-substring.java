class Solution {
    boolean[][] dp;
    public boolean solve(String s,int i,int j){
            if(i>=j){
                return true;
            }
            if(dp[i][j]!=false){
                return dp[i][j];
            }
            if(s.charAt(i)!=s.charAt(j)){
                return dp[i][j]=false;
            }

        return dp[i][j]=solve(s,i+1,j-1);
    }
    public String longestPalindrome(String s) {
        int n=s.length();
        dp=new boolean[n][n];
        
        int max=0;
        int a=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(solve(s,i,j)){
                    if(j-i+1>max){
                        max=j-i+1;
                        a=i;
                    }
                }
            }
        }
        return s.substring(a,max+a);
    }
}