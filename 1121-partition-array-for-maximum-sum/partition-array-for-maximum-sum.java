class Solution {
    public int solve(int i,int[] a,int k,int[] t){
        int n=a.length;
        if(i==n){
            return 0;
        }
        if(t[i]!=-1){
            return t[i];
        }
        int r=0;
        int max=Integer.MIN_VALUE;
        for(int j=i;j<n && j-i+1<=k;j++){
            max=Math.max(max,a[j]);
            r=Math.max(r,(j-i+1)*max+solve(j+1,a,k,t));
        }
        return t[i]=r;
    }
    public int maxSumAfterPartitioning(int[] arr, int k) {
        int n=arr.length;
        int[] t=new int[n+1];
        Arrays.fill(t,-1);
        return solve(0,arr,k,t);
    }
}