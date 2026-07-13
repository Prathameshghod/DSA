class Solution {
    public boolean canPartition(int[] nums) {
        int n=nums.length;
        int s=0;
        for(int i=0;i<n;i++){
            s+=nums[i];
        }
        if(s%2!=0){
            return false;
        }
        s=s/2;
        boolean[][] t= new boolean[n+1][s+1];
        for(int i=0;i<n+1;i++){
            for(int j=0;j<s+1;j++){
                if(j==0){
                    t[i][j]=true;
                }
            }
        }

        for(int i=1;i<n+1;i++){
            for(int j=1;j<s+1;j++){
                if(nums[i-1]<=j){
                    t[i][j]=t[i-1][j-nums[i-1]] || t[i-1][j];
                }
                else{
                    t[i][j]=t[i-1][j];
                }
            }
        }
        return t[n][s];
    }
}