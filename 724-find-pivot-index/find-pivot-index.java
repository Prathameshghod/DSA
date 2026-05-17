class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int l=0;
        int m=nums[0];
        int s=0;
        for(int i=0;i<n;i++){
           s+=nums[i];
        }
        int r=s-m;
        if(l==r){
            return 0;
        }
        for(int i=1;i<n;i++){
            l+=nums[i-1];
            r-=nums[i];
            if(l==r){
                return i;
            }
        }
        return -1;
    }
}