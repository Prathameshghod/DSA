class Solution {
    public int subarraySum(int[] nums, int k) {
        int n=nums.length;
        int c=0;
        for (int i=0;i<n;i++){
            int s=0;
            for (int j=i;j<n;j++){
                s+=nums[j];
                if(s==k){
                    c++;
                }
            }
        }
        return c;
    }
}



class Solution {
    public int subarraySum(int[] nums, int k) {
        int n=nums.length;
        int c=0;
        Map<Integer,Integer> a= new HashMap<>();
        int s=0;
        for(int i=0;i<n;i++){
            s+=nums[i];
            if(s==k){
                c++;
            }
            if(a.containsKey(s-k)){
                c+=a.get(s-k);
            }
            a.put(s,a.getOrDefault(s,0)+1);
        }
        return c;
    }
}