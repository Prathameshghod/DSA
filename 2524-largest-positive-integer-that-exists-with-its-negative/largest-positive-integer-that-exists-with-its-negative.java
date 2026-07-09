class Solution {
    public int findMaxK(int[] nums) {
        int n=nums.length;
        Set<Integer> a=new HashSet<>();
        int c=-1;
        for(int i=0;i<n;i++){
            if(Math.abs(nums[i])>c && a.contains(-nums[i])){
                c=Math.abs(nums[i]);
            }
            a.add(nums[i]);
        }
        return c;
    }
}