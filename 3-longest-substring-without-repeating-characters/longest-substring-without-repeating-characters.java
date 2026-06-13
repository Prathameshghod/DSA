class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        int[] a= new int[128];
        int max=0;
        int l=0;

        for(int i=0;i<n;i++){
            a[s.charAt(i)]++;

            while(a[s.charAt(i)]>1){
                a[s.charAt(l)]--;
                l++;
            }

            if(a[s.charAt(i)]==1){
                max=Math.max(max,i-l+1);
            }
        }
        return max;
    }
}