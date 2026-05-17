class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int p=1;
        int s=1;
        int r=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(p==0){
                p=1;
            }
            if(s==0){
                s=1;
            }
            p*=nums[i];
            s*=nums[n-i-1];
            int a=Math.max(p,s);
            r=Math.max(r,a);
        }
        return r;
    }
}