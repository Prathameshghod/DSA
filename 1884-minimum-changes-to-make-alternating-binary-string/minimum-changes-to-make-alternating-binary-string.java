class Solution {
    public int minOperations(String s) {
        int n=s.length();

        char o='0';
        char z='1';
        int ai=0;
        int ci=0;
       
        for(int i=0;i<n;i++){
            char b=s.charAt(i);
            if(b!=o){
                ai++;
            }
            
            o= (o=='0') ? '1':'0';
            
        }
        return Math.min(ai,n-ai);
    }
}