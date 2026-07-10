class Solution {
    public int longestPalindrome(String s) {
        int[] a= new int[128];
        int n=s.length();
        for(char i:s.toCharArray()){
            a[i]++;
        }
        int c=0;
        boolean b=false;
        for(int i=0;i<128;i++){
            if(a[i]%2==0){
                c+=a[i];
            }
            else{
                if(a[i]>2){
                    c+=a[i]-1;
                    b=true;
                }
                else{
                    b=true;
                }
            }
        }
        if(b){
            c++;
        }
        return c;
    }
}