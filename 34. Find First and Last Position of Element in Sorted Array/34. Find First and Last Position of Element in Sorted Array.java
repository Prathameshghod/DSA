class Solution {
    public int ub(int[] nums,int l, int h,int target){
        int c=-1;
        while (l<=h){
            int m=(l+h)/2;
            
            if(nums[m]==target){
                c=m;
                l=m+1;
            }
            else if(nums[m] > target){
                h=m-1;
            }
            else{
                l=m+1;
            }
        }
        return c;
    }

    public int lb(int[] nums,int l, int h,int target){
        int c=-1;
        while (l<=h){
            int m=(l+h)/2;
            
            if(nums[m]==target){
                c=m;
                h=m-1;  
            }
            else if(nums[m] < target){
                l=m+1;
            }
            else{
                 h=m-1;    
            }
        }
        return c;
    }
    public int[] searchRange(int[] nums, int target) {
        int[] b= new int[2];
        int l=0;
        int n=nums.length;
        int h=n-1;
    
        b[0]=lb(nums,l,h,target);
        b[1]=ub(nums,l,h,target);
        return b;
    }
}