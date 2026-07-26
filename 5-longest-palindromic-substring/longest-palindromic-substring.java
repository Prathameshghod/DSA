class Solution {
    public String longestPalindrome(String s) {
        int n=s.length();
        for(int l=n;l>0;l--){
            for(int i=0;i<n-l+1;i++){
                if(ispal(s,i,i+l)){
                    return s.substring(i,i+l);
                }
            }
        }
        return "";
    }
    public boolean ispal(String s,int i,int j){
         int left = i;
        int right = j - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;

    }
}