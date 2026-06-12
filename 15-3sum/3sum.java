class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> r= new HashSet<>();
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            int a=-nums[i];
            int j=i+1;
            int k=n-1;
            while(j<k){
                int b=nums[j]+nums[k];
                if(b<a){
                    j++;
                }
                else if(b>a){
                    k--;
                }
                else{
                    r.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                    k--;
                }
            }
        }
        List<List<Integer>> d= new ArrayList<>(r);
        return d;
    }
}