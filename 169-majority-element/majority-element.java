class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int a=0;
        int b=0;
        for(int i:nums){
            if(b==0){
                a=i;
            }
            b+= a==i ? 1:-1;
        }
        return a;
    }
}