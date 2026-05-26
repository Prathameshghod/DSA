class Solution {
    public int[] sortArray(int[] nums) {
        int n=nums.length;
        mergesort(nums,0,n-1);
        return nums;
    }
    public void mergesort(int[] a,int l,int h){
        if(l>=h){
            return;
        }
       int m=(l+h)/2;
       mergesort(a,l,m);
       mergesort(a,m+1,h);
       merge(a,l,m,h);
    }
    public int[] merge(int[] a,int l,int m,int h){
        
       int left=l;
       int right=m+1;
       List<Integer> b= new ArrayList<>();
       while(left<=m && right<=h ){
        if(a[left]<=a[right]){
            b.add(a[left]);
            left++;
        }
        else{
            b.add(a[right]);
            right++;
        }
       }
       while(left<=m){
        b.add(a[left]);
        left++;
       }
       while(right<=h){
        b.add(a[right]);
        right++;
       }
        for (int i = l; i <= h; i++) {

            a[i] = b.get(i - l);
        }
       return a;
    }
}