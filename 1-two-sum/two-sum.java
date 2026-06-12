class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> a= new HashMap<>();
        int[] b= new int[2];
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(a.containsKey(target-nums[i])){
                b[0]=a.get(target-nums[i]);
                b[1]=i;
                return b;
            }
            a.put(nums[i],i);
        }
        return b;
    }
}