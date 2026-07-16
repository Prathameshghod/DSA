class Solution {
    public int solve(String a,String b,int n,int m,int[][] t){
        if(n==0 || m==0){
            return 0;
        }
        if(t[n][m]!=-1){
            return t[n][m];
        }
        if(a.charAt(n-1)==b.charAt(m-1)){
            return t[n][m]=1+solve(a,b,n-1,m-1,t);
        }
        return t[n][m]=Math.max(solve(a,b,n-1,m,t),solve(a,b,n,m-1,t));
    }
    public int longestCommonSubsequence(String text1, String text2) {
        int n=text1.length();
        int m=text2.length();
        int[][] t= new int[n+1][m+1];
        for(int[] i:t){
            Arrays.fill(i,-1);
        }
        return solve(text1,text2,n,m,t);
    }
}