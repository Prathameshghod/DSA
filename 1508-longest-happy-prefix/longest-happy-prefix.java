class Solution {
    public String longestPrefix(String s) {
        int n=s.length();

        int[] lps=new int[n];
        int i=1;
        int l=0;
        while(i<n){
            if(s.charAt(i)==s.charAt(l)){
                l++;
                lps[i]=l;
                i++;
            }
            else{
                if(l!=0){
                    l=lps[l-1];
                }
                else{
                    i++;
                }
            }
        }
        String a=s.substring(n-lps[n-1]);
        return a;
    }
}