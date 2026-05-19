class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        Map<Integer,Integer> b= new HashMap<>();
        
        for(int i=0;i<m;i++){
            b.put(nums2[i],b.getOrDefault(nums2[i],0)+1);
        }
        for(int i=0;i<n;i++){
            if(b.containsKey(nums1[i])){
                return nums1[i];
            }
            
        }
        return -1;
    }
}