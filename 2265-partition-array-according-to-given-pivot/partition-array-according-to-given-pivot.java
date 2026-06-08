class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n=nums.length;
        int[] r= new int[n];
        int x=0;
        int y=n-1;
        for(int i=0,j=n-1;i<n;i++,j--){
            if(nums[i]<pivot){
                r[x]=nums[i];
                x++;
            }
            if(nums[j]>pivot){
                r[y]=nums[j];
                y--;
            }
        }
        while(x<=y){
            r[x]=pivot;
            x++;
        }
        return r;
    }
}