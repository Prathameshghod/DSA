class Solution {
    public boolean uniformArray(int[] nums1) {
        int n=nums1.length;
        int o=0;
        int min=Integer.MAX_VALUE;
      
        for(int i:nums1){
            if(i%2==1){
                o++;
               
            }
            min=Math.min(min,i);
        }
        if(o==0 || o==n){
            return true;
        }
        if(min%2==1){
            return true;
        }
        return false;
    }
}