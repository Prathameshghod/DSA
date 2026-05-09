class Solution {
    public void rotate(int[] nums, int k) {
        List<Integer> a= new ArrayList<>();
        int n=nums.length;
        k=k%n;
        for(int i=n-1;i>=n-k;i--){
            a.add(nums[i]);
        }
        Collections.reverse(a);
        for(int i=0;i<n-k;i++){
            a.add(nums[i]);
        }
        for(int i=0;i<n;i++){
            nums[i]=a.get(i);
        }
    }
}