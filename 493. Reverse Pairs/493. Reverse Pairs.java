class Solution {
    public int merge(int[] a,int l,int m, int h){
        int[] b= new int[h-l+1];
        int left=l;
        int right=m+1;
        int c=0;
        int x=l;
        int y=m+1;
        while(x<=m && y<=h){
            if((long) a[x]>(long) 2*a[y]){
                c+=(m-x+1);
                y++;
            }
            else{
                x++;
            }
        }
        int k=0;
        while(left<=m && right<=h){
            if(a[left]<=a[right]){
                b[k]=a[left];
                left++;
                k++;
            }
            else{
                b[k]=a[right];
                right++;
                k++;
            }
        }
        while(left<=m){
            b[k]=a[left];
            left++;
            k++;
        }
        while(right<=h){
            b[k]=a[right];
            right++;
            k++;
        }
        for(int i=l;i<=h;i++){
            a[i]=b[i];
        }
        return c;
    }

    public int mergesort(int[] a,int l,int h){
        int c=0;
        if(l>=h){
            return c;
        }
        int m=(l+h)/2;
        c+=mergesort(a,l,m);
        c+=mergesort(a,m+1,h);
        c+=merge(a,l,m,h);
        return c;
    }

    public int reversePairs(int[] nums) {
        int n=nums.length;
        int c=mergesort(nums,0,n-1);
        return c;
    }
}