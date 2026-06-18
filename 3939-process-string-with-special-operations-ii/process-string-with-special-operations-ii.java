class Solution {
    public char processStr(String s, long k) {
        int n=s.length();
        long l=0;
        for(int i=0;i<n;i++){
            char a=s.charAt(i);
            switch(a){
                case '*':
                    if(l>0){
                        l--;
                    }
                    break;
                case '#':
                    l*=2;
                    break;
                case '%':
                    break;
                default:
                    l++;
                    break;
            }
        }
        if(k+1>l){
            return '.';
        }
        
        for(int i=n-1;i>=0;i--){
            char c=s.charAt(i);
            switch(c){
                case '*':
                    l++;
                    break;
                
                case '%':
                    k=l-k-1;
                    break;
                
                case '#':
                    if(k+1>(l+1)/2){
                        k-=l/2;
                    }
                    l=(l+1)/2;
                    break;
                default:
                    if(k+1==l){
                        return c;
                    }
                    l--;
                    break;
            }
        }
        return '.';
    }
}