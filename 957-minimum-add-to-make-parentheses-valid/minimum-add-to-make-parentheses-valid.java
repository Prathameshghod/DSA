class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> a= new Stack<>();
        for(char i:s.toCharArray()){
            if(i=='('){
                    a.push(i);
            }
            else if(i==')'){
                if(!a.isEmpty() && a.peek()=='('){
                    a.pop();
                }
                else{
                    a.push(i);
                }
            }
        }
        int c=0;
        while(!a.isEmpty()){
            a.pop();
            c++;
        }
        return c;
    }
}   