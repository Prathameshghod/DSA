class Solution {
    public static int findMean(int[] arr) {
        // code here
        int c=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            c+=arr[i];
        }
        int b=c/n;
        return b;
    }
};