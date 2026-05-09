class Solution {
    public int[] frequencySort(int[] nums) {
        int n=nums.length;
        Map<Integer,Integer> a= new HashMap<>();
        for(int i=0;i<n;i++){
            a.put(nums[i],a.getOrDefault(nums[i],0)+1);
        }
        Integer[] b=new Integer[n];
         for(int i=0;i<n;i++){
            b[i]=nums[i];
         }
         Arrays.sort(b,(x,y) -> {
            if (a.get(x).equals(a.get(y))){
                return Integer.compare(y,x);
            }
            return Integer.compare(a.get(x),a.get(y));
         });

         for(int i=0;i<n;i++){
            nums[i]=b[i];
         }
         return nums;
    }
}