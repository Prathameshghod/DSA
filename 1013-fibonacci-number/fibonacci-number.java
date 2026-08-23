class Solution {
    public int solve(int n,int[] t){
        if(n==0){
            return 0;
        }
         if(n==1){
            return 1;
        }
        if(t[n]!=-1){
            return t[n];
        }
        return t[n]=solve(n-1,t)+solve(n-2,t);
    }
    public int fib(int n) {
        int[] t= new int[n+1];
        Arrays.fill(t,-1);
        return solve(n,t);
    }
}
