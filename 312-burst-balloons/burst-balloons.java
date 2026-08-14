class Solution {
    public int solve(int i,int j,int[] a,Integer[][] t){
        if(i>j){
            return 0;
        }
        if(t[i][j]!=null){
            return t[i][j];
        }
        int max=0;
        for(int k=i;k<j+1;k++){
            int take=solve(i,k-1,a,t)+solve(k+1,j,a,t)+(a[i-1]*a[k]*a[j+1]);
            max=Math.max(take,max);
        }
        return t[i][j]=max;
    }
    public int maxCoins(int[] nums) {
        int n=nums.length;
        int[] a= new int[n+2];
        a[0]=1;
        a[n+1]=1;
        for(int i=1;i<n+1;i++){
            a[i]=nums[i-1];
        }
        Integer[][] t= new Integer[n+2][n+2];
        return solve(1,n,a,t);
    }
}