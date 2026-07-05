class Solution {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int n=nums.length;
        int[][] a=new int[n/3][3];
        int[][] b=new int[0][0];
        int j=0;
        for(int i=2;i<n;i+=3){
            if(nums[i]-nums[i-2]>k){
                return b;
            }
            else{
                a[j][0]=nums[i-2];
                a[j][1]=nums[i-1];
                a[j][2]=nums[i];
            }
            j++;
        }
        
        return a;
    }
}