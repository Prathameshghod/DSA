class Solution {
    public String maximumOddBinaryNumber(String s) {
        int z=0;
        int o=0;
        for(char i:s.toCharArray()){
            if(i=='1'){
                o++;
            }
            else{
                z++;
            }
        }
        return "1".repeat(o-1)+"0".repeat(z)+"1";
    }
}