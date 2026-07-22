class Solution {
    public int solve(int m,int n,int[][] t){
        if(m==1 || n==1){
            return 1;
        }
        if(t[m][n]!=-1){
            return t[m][n];
        }
        return t[m][n]=solve(m-1,n,t)+solve(m,n-1,t);
    }
    public int uniquePaths(int m, int n) {
        int[][] t= new int[m+1][n+1];
        for(int[] i:t){
            Arrays.fill(i,-1);
        }
        return solve(m,n,t);
    }
}