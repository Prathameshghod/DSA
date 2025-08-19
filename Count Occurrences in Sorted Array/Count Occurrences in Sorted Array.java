class Solution {
    public int lb(int[] a,int l,int h,int target){
        int c=-1;
        while(l<=h){
            int m=(l+h)/2;
            if(a[m]==target){
                c=m;
                h=m-1;
            }
            else if(a[m]<target){
                l=m+1;
            }
            else{
                h=m-1;
            }
        }
        return c;
    }

    public int ub(int[] a,int l,int h,int target){
        int c=-1;
        while(l<=h){
            int m=(l+h)/2;
            if(a[m]==target){
                c=m;
                l=m+1;
            }
            else if(a[m]<target){
                l=m+1;
            }
            else{
                h=m-1;
            }
        }
        return c;
    }
    
    public int countFreq(int[] arr, int target) {
        // code here
        int n=arr.length;
        int l=0;
        int h=n-1;
        int a=lb(arr,l,h,target);
        int b=ub(arr,l,h,target);
        if(b==-1 && a==-1){
            return 0;
        }
        return b-a+1;
        
    }
}
