// User function Template for Java

class Solution {
    public ArrayList<Integer> customSort(int[] arr) {
        // your code
        
        int n=arr.length;
        int m=n/2;
        Arrays.sort(arr,0,m);
        Arrays.sort(arr,m,n);
        int l=m;
        int r=n-1;
        while(l<r){
            int temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
        }
        
        ArrayList<Integer> a= new ArrayList<>();
        for(int i=0;i<n;i++){
            a.add(arr[i]);
        }
        return a;
    }
}