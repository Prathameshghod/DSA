class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int a=0;
        int ai=-1;
        for(int i=0;i<n;i++){
            if(nums[i]>a){
                a=nums[i];
                ai=i;
            }
        }
        int b=0;
        int bi=-1;
        for(int i=0;i<n;i++){
            if(nums[i]>b && i!=ai){
                b=nums[i];
                bi=i;
            }
        }
        return (nums[ai]-1)*(nums[bi]-1);
    }
}    