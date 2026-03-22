class Solution {
    public boolean uniformArray(int[] nums1) {
        int n=nums1.length;
        int o=0;
        int min_odd=Integer.MAX_VALUE;
        int min_even=Integer.MAX_VALUE;
        for(int i:nums1){
            if(i%2==1){
                o++;
                min_odd=Math.min(min_odd,i);
            }
            else{
                min_even=Math.min(min_even,i);
            }
        }
        if(o==0 || o==n){
            return true;
        }
        if(min_even-min_odd >=1){
            return true;
        }
        return false;
    }
}