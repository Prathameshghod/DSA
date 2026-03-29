class Solution {
    public int firstMatchingIndex(String s) {
        int n=s.length();
        int m=n/2;
        for(int i=0;i<m;i++){
            if(s.charAt(i)==s.charAt(n-i-1)){
                return i;
            }
        }
        if(n%2==1){
            return m;
        }
        return -1;
    }
}