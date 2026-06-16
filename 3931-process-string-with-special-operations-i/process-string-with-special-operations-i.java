class Solution {
    public String processStr(String s) {
        int n=s.length();
        StringBuilder a= new StringBuilder();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='#'){
                a.append(a.toString());
            }
            else if(s.charAt(i)=='%'){
                a.reverse();
            }
            else if(s.charAt(i)=='*'){
                if(!a.isEmpty()){
                    a.deleteCharAt(a.length() - 1);
                }
            }
            else{
                a.append(s.charAt(i));
            }
        }
        return a.toString();
    }
}