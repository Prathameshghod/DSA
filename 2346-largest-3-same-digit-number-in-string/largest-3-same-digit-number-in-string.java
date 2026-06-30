class Solution {
    public String largestGoodInteger(String num) {
        int n=num.length();
        int max=-1;
        for(int i=2;i<n;i++){
             
            if ((num.charAt(i) == num.charAt(i - 1)) && (num.charAt(i - 1) == num.charAt(i - 2))) {
                int r=num.charAt(i)-'0';
                max=Math.max(max,r);
            }
        }
        if(max==-1){
            return "";
        }
        return String.valueOf(max).repeat(3);
    }
}