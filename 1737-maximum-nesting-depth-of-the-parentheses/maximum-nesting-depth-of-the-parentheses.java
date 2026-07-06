class Solution {
    public int maxDepth(String s) {
        int c=0;
        int n=s.length();
        int max=0;
        for(char i:s.toCharArray()){
            if(i=='('){
                c++;
                max=Math.max(max,c);
            }
            else if(i==')'){
                c--;
            }
        }
        return max;
    }
}