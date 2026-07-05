class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int[] a= new int[n];
        int i=0;
        int j=n-1;
        int k=j;
        while(i<j){
            int b=nums[i]*nums[i];
            int c=nums[j]*nums[j];
            if(b>c){
                a[k--]=b;
                i++;
            }
            else{
                a[k--]=c;
                j--;
            }
        }
        a[0]=nums[i]*nums[i];
        return a;
    }
}