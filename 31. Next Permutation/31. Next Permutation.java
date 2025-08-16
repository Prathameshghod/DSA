class Solution {
    private void reverse(int i,int j,int[] nums){
        while(i<j){
            swap(nums,i,j);
            i++;
            j--;
        }
    }
    private void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int a=-1;
        for (int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                a=i;
                break;
            }
        }
        if(a==-1){
            reverse(0,n-1,nums);
            return;
        }
     
        for (int i=n-1;i>a;i--){
            if(nums[i]>nums[a]){
                swap(nums,i,a);
                break;
            }
        }
       reverse(a+1,n-1,nums);
       return;
    }
}