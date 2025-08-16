class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int c=nums[0];
        int r=nums[0];
        for (int i=1;i<n;i++){
            if(nums[i]>c){
                c=Math.max(nums[i],c+nums[i]);
                r=Math.max(r,c);
            }
            
            else{
                c+=nums[i];
                r=Math.max(r,c);
            }
        }
        return r;
    }
}





class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int c=0;
        int r=Integer.MIN_VALUE;
        for (int i=0;i<n;i++){
            c+=nums[i];
            if(c>r){
                r=c;
            }
            if(c<0){
                c=0;
            }
        }
        return r;
    }
}