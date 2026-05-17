class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Set<Integer> s=new HashSet<>();
        List<Integer> a=new ArrayList<>();
        int n=nums.length;

        for(int i=0;i<n;i++){
            if(s.contains(nums[i])){
                a.add(nums[i]);
            }
            else{
                s.add(nums[i]);
            }
        }
        return a;
    }
}