class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int l=0;
        int r=n-1;
        int maxl=0;
        int maxr=0;
        int c=0;
        while(l<r){
            if(height[l]<=height[r]){
                if(height[l]>=maxl){
                    maxl=height[l];
                }
                else{
                    c+=(maxl-height[l]);
                }
                l++;
            }
            else{
                if(height[r]>=maxr){
                    maxr=height[r];
                }
                else{
                    c+=(maxr-height[r]);
                }
                r--;
            }
        }
        return c;
    }
}