class Solution {
    public void swap(int[] a, int[] b,int i,int j){
        if(a[i]>b[j]){
            int temp=a[i];
            a[i]=b[j];
            b[j]=temp;
        }
    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int a = (int) Math.ceil((n + m) / 2.0);
        while(a>0){
            int l=0;
            int r=l+a;
            while(r < m+n){
                if(l<m && r>=m){
                    swap(nums1,nums2,l,r-m);
                }
                else if(l>=m){
                    swap(nums2,nums2,l-m,r-m);
                }
                else{
                    swap(nums1,nums1,l,r);
                }
                l++;
                r++;
            }
           
            if(a==1){
                a=0;
            }
             a = (int) Math.ceil(a/2.0);
        }
        for (int i=0;i<n;i++){
            nums1[i+m]=nums2[i];
        }

    }
}




class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        while(m!=0 && n!=0){
            if(nums1[m-1]>nums2[n-1]){
                nums1[m+n-1]=nums1[m-1];
                m--;
            }
            else{
                nums1[m+n-1]=nums2[n-1];
                n--;
            }
        }
        while(m!=0){
            nums1[m+n-1]=nums1[m-1];
            m--;
        }
        while(n!=0){
            nums1[m+n-1]=nums2[n-1];
            n--;
        }
    }
}