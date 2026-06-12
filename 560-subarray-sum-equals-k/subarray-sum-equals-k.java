class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> a= new HashMap<>();
        int n=nums.length;
        a.put(0,1);
        int c=0;
        int s=0;
        
        for(int i=0;i<n;i++){
            s+=nums[i];
            
            if(a.containsKey(s-k)){
                   c+=a.get(s-k);
                }
            a.put(s,a.getOrDefault(s,0)+1);
                    
        }
        return c;
    }
}