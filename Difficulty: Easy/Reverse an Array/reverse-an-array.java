class Solution {
    public void reverseArray(int arr[]) {
        // code here
        int n=arr.length;
        int m=n/2;
        
        for(int i=0;i<m;i++){
            int temp=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;
        }
    
    }
}