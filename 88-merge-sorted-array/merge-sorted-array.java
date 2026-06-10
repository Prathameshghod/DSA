class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] a= new int[n+m];
        int i=0;
        int j=0;
        int idx=0;
        while(i<m && j<n){
            if(nums1[i]<=nums2[j]){
                a[idx]=nums1[i];
                i++;
                idx++;
            }
            else{
                a[idx]=nums2[j];
                idx++;
                j++;
            }
        }
        while(i<m){
            a[idx]=nums1[i];
            i++;
            idx++;
        }
        while(j<n){
            a[idx]=nums2[j];
            j++;
            idx++;
        }
        for(int x=0;x<n+m;x++){
            nums1[x]=a[x];
        }
        return;
    }
}