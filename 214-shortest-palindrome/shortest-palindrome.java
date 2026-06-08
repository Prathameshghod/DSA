class Solution {
    public int[] computelps(String s){
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
        return lps;
    }
    public String shortestPalindrome(String s) {

        String rev=new StringBuilder(s).reverse().toString();
        String a=s+"-"+rev;

        int n=a.length();

        int[] lps= computelps(a);

        int b=lps[n-1];

        String c=s.substring(b);

        String d=new StringBuilder(c).reverse().toString();
        return d+s;
        
    }
}
