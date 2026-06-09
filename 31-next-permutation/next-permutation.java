class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int a=-1;
        for(int i=n-1;i>0;i--){
            if(nums[i]>nums[i-1]){
                a=i-1;
                break;
            }
        }
        if(a==-1){
            int left = 0;
            int right = nums.length - 1;

            while(left < right) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;

                left++;
                right--;
            }
        }

        else{
            for(int i=n-1;i>0;i--){
            if(nums[i]>nums[a]){
                int temp = nums[i];
                nums[i] = nums[a];
                nums[a] = temp;
                break;
            }
            }
            int left = a+1;
            int right = nums.length - 1;

            while(left < right) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;

                left++;
                right--;
            }
        }
        
        return;
    
}
}