class Solution {
    public long sumAndMultiply(int n) {
        int a=0;
        int c=1;
        int s=0;
        while(n>0){
            int b=n%10;
            if(b>0){
                s+=b*c;
                c*=10;
                
            }
            a+=b;
            n=n/10;
        }
        return (long) a*s;
    }
}