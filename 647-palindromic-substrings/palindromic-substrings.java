class Solution {
    public int countSubstrings(String s) {
        int n=s.length();
        int c=0;
        for(int i=0;i<n;i++){
            c+=count(s,i,i);
            c+=count(s,i,i+1);
        }
        return c;
    }
    public int count(String s,int l,int r){
        int n=s.length();
        int c=0;
        while((l>=0 && r<n) && s.charAt(l)==s.charAt(r)){
            c++;
            l--;
            r++;
        }
        return c;
    }
}