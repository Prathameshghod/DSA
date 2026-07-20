class Solution {
    public int i=0;
    public boolean solve(String s){
        if(s.charAt(i)=='t'){
            i++;
            return true;
        }
        else if(s.charAt(i)=='f'){
            i++;
            return false;
        }

        char op=s.charAt(i);
        i+=2;

        if(op=='!'){
            boolean c=solve(s);
            i++;
            return !c;
        }
        boolean ans=(op=='&');

        while(s.charAt(i)!=')'){
            boolean curr=solve(s);
            if(op=='&'){
                ans=ans & curr;
            }
            else if(op=='|'){
                ans=ans | curr;
            }
            if(s.charAt(i)==','){
                i++;
            }
        }
        i++;
        return ans;
    }
    public boolean parseBoolExpr(String expression) {
        return solve(expression);
    }
}