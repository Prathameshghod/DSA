class Solution {
    public int longestConsecutive(int[] nums) {
    
        TreeMap<Integer,Integer> a= new TreeMap<>();
        int n=nums.length;
        if(n==0){
            return 0;
        }
        for(int i:nums){
            a.put(i,i);
        }
        int max=1;
        int c=1;
        for(Integer i:a.keySet()){
            if(a.containsKey(i+1)){
                c++;
            }
            else{
                c=1;
            }
            max=Math.max(max,c);
        }
        return max;
    }
}