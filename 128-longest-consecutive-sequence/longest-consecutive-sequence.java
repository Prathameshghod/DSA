class Solution {
    public int longestConsecutive(int[] nums) {
    
        Set<Integer> a= new HashSet<>();
        int n=nums.length;
        if(n==0){
            return 0;
        }
        for(int i:nums){
            a.add(i);
        }
        int max=0;

        for(int i:a){
            if(!a.contains(i-1)){
                int curr=i;
                int l=1;
                while(a.contains(curr+1)){
                    l++;
                    curr++;
                }
                max=Math.max(max,l);
            }
        }
        return max;
    }
}