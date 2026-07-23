class Solution {
    public boolean solve(int[] a,int i,int s,Boolean[][] t){
        if(s==0){
            return true;
        }
        if(i==a.length){
            return false;
        }
        if(t[i][s]!=null){
            return t[i][s];
        }
        if(a[i]<=s){
            return t[i][s]=solve(a,i+1,s-a[i],t) || solve(a,i+1,s,t);
        }
        return t[i][s]=solve(a,i+1,s,t);
    }
    public Boolean canPartition(int[] nums) {
        int n=nums.length;
        int s=0;
        for(int i=0;i<n;i++){
            s+=nums[i];
        }
        if(s%2!=0){
            return false;
        }
        s=s/2;
        Boolean[][] t= new Boolean[n+1][s+1];
        return solve(nums,0,s,t);
    }
}