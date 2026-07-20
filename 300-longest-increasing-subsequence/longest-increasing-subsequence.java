class Solution {
    public int solve(int[] a,int i,int n,int prev,int[][] t){
        if(i==n){
            return 0;
        }
        if(t[i][prev+1]!=-1){
            return t[i][prev+1];
        }
        if(prev==-1|| a[i]>a[prev]){
            return t[i][prev+1]=Math.max(1+solve(a,i+1,n,i,t),solve(a,i+1,n,prev,t));
        }
      
        return t[i][prev+1]=solve(a,i+1,n,prev,t);
    }
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        int[][] t= new int[n+1][n+1];
        for(int[] i:t){
            Arrays.fill(i,-1);
        }
        return solve(nums,0,nums.length,-1,t);
    }
}