class Solution {
    public int solve(int n,int[] t){
        if(n==1 || n==0){
            return 1;
        }
        if(t[n]!=-1){
            return t[n];
        }
        return t[n]=solve(n-1,t)+solve(n-2,t);
    }
    public int climbStairs(int n) {
        int[] t= new int[n+1];
        Arrays.fill(t,-1);
        return solve(n,t);
    }
}