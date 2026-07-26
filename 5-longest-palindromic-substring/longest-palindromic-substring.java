
class Solution {
    public boolean ispal(String s,int i,int j){
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)){
               return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public String longestPalindrome(String s) {
        // code here
        int n=s.length();
        int len=0;
        int idx=-1;
        boolean[][] t= new boolean[n][n];
        for(int l=1;l<=n;l++){
            for(int i=0;i+l-1<n;i++){
                int j=i+l-1;
                if(i==j){
                    t[i][j]=true;
                }
                else if(i+1==j && s.charAt(i)==s.charAt(j)){
                    t[i][j]=true;
                }
                else{
                    t[i][j]= ( s.charAt(i)==s.charAt(j) && t[i+1][j-1]);
                }
                if (t[i][j] && l > len) {
                    idx = i;
                    len = l;
                }
            }
        }
        return s.substring(idx,idx+len);
    }
}