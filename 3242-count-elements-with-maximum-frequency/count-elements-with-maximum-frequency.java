class Solution {
    public int maxFrequencyElements(int[] nums) {
        int n=nums.length;
        Map<Integer,Integer> a= new HashMap<>();
        for(int i=0;i<n;i++){
            a.put(nums[i],a.getOrDefault(nums[i],0)+1);
        }
        int max=0;
        for(int i:a.values()){
            max=Math.max(max,i);
        }
        int b=0;
        for(int i:a.values()){
            if(i==max){
                b++;
            }
        }
        return b*max;
    }
}