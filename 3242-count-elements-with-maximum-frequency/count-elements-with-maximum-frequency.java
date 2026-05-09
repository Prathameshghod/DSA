class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer,Integer> m= new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            m.put(nums[i],m.getOrDefault(nums[i],0)+1);
        }
        int a=0;
        for(int i:m.values()){
            a=Math.max(i,a);
        }
        int c=0;
         for(int i:m.values()){
            if(i==a){
                c+=i;
            }
         }
         return c;
    }
}