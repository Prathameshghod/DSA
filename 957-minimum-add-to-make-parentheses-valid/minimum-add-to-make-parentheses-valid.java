class Solution {
    public int minAddToMakeValid(String s) {
        int a=0;
        int b=0;
        for(char i:s.toCharArray()){
            if(i=='('){
                 a++;
            }
            else{
                if(a>0){
                    a--;
                }
                else{
                    b++;
                }
            }
        }
       return a+b;
    }
}   