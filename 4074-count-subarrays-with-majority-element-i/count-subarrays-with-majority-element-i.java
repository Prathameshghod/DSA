class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int n=nums.length;
        int r=0;
    
        for(int i=0;i<n;i++){
            int c=0;
            for(int j=i;j<n;j++){
        
                    c+=nums[j]==target? 1:0;
                
                if(c>(j-i+1)/2){
                    r++;
                }
            }
        }
        return r;
    }
}