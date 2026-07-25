class Solution {
    public int c;
    public void solve(String s,int i,int j){
        while(i>=0 && j<s.length() && s.charAt(i)==s.charAt(j)){
                c++;
                i--;
                j++;
            
        }
    }
    public int countSubstrings(String s) {
        int n=s.length();
        for(int i=0;i<n;i++){
            solve(s,i,i);
            solve(s,i,i+1);
        }
        return c;
    }
}