class Solution {
    public int[] countlps(String s){
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
                    lps[i]=0;
                    i++;
                }
            }
        }
        return lps;
    }
    public int strStr(String haystack, String needle) {
        int n=haystack.length();
        int m=needle.length();

        int[] lps=countlps(needle);

        int i=0;
        int j=0;
        int l=1;
        while(i<n){
            if(haystack.charAt(i)==needle.charAt(j)){
                i++;
                j++;
            }
            if(j==m){
                return i-m;
            }
            else if(i<n && haystack.charAt(i)!=needle.charAt(j)){
                if(j!=0){
                    j=lps[j-1];
                }
                else{
                    
                    i++;
                }
            }
        }
        return -1;
    }
}