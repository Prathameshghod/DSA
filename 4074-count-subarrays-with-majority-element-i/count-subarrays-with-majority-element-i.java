class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int n=nums.length;
        int r=0;
    
        for(int i=0;i<n;i++){
            int c=0;
            for(int j=i;j<n;j++){
        
                    c+=nums[j]==target? 1:-1;
                
                if(c>0){
                    r++;
                }
            }
        }
        return r;
    }
}