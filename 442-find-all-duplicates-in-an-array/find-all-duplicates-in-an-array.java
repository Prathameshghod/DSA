class Solution {
    public List<Integer> findDuplicates(int[] nums) {
    
        List<Integer> a=new ArrayList<>();
        int n=nums.length;

        for(int i=0;i<n;i++){
            int j=Math.abs(nums[i]);
            if(nums[Math.abs(j-1)] > 0){
                nums[Math.abs(j-1)]=-nums[Math.abs(j-1)];
            }
            else if(nums[Math.abs(j-1)] < 0){
                a.add(j);
            }
        }
        return a;
    }
}