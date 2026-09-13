class Solution {
    public int countSpecialIntegers(int[] nums) {
        int[] a=new int[1000];
        int n=nums.length;
        for(int i:nums){
            a[i-1]++;
        }
        int r=0;
        for(int i=0;i<n;i++){
            int b=nums[i];
            if(a[b-1]!=3){
                continue;
            }
            a[b-1]=-1;
            for(int j=1;i+(j*2)<n;j++){
                if(nums[i+j]==b && nums[i+(j*2)]==b){
                    r++;
                    break;
                }
            }
        }
        return r;
    }
}