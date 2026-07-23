class Solution {
    public int solve(int[] a,int curr,int prev,int[][] t){
        if(curr==a.length){
            return 0;
        }
        if(t[curr][prev+1]!=-1){
            return t[curr][prev+1];
        }
        if(prev==-1 || a[curr]>a[prev]){
            return t[curr][prev+1]=Math.max(1+solve(a,curr+1,curr,t),solve(a,curr+1,prev,t));
        }
        else{
            return t[curr][prev+1]=solve(a,curr+1,prev,t);
        }
    }
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        int[][] t=new int[n+1][n+1];
        for(int[] i:t){
            Arrays.fill(i,-1);
        }
        return solve(nums,0,-1,t);
    }
}