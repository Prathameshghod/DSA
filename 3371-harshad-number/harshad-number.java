class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int a=x;
        int c=0;
        while(x>0){
            int b=x%10;
            c+=b;
            x/=10;
        }
        if(a%c==0){
            return c;
        }
        return -1;
    }
}