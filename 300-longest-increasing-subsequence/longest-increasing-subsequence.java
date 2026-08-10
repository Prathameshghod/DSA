class Solution {
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        int[][] t= new int[n+1][n+1];
       
        for(int i=n-1;i>=0;i--){
            for(int j=i-1;j>=-1;j--){
                int take=0;
                int skip=t[i+1][j+1];
                if(j==-1 || nums[i]>nums[j]){
                    take=1+t[i+1][i+1];
                }
                t[i][j+1]=Math.max(take,skip);
            }
        }
        return t[0][0];
    }
}