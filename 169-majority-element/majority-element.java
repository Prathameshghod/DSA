class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int a=(int) Math.floor(n/2);
        Map<Integer,Integer> b= new HashMap<>();
        for(int i:nums){
            b.put(i,b.getOrDefault(i,0)+1);
            if(b.get(i)>a){
                return i;
            }
        }
        return -1;
    }
}