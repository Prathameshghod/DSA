class Solution {
     private static final String[] belowTen = { "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine" };
    private static final String[] belowTwenty = { "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen" };
    private static final String[] belowHundred = { "", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety" };
    public String numberToWords(int num) {
        if(num==0){
            return "Zero";
        }
        return convert(num);
    }
    public String convert(int n){
        if(n<10){
            return belowTen[n];
        }
        if(n<20){
            return belowTwenty[n-10];
        }
        if(n<100){
            return belowHundred[n/10]+(n%10!=0?" "+convert(n%10):"");
        }
        if(n<1000){
            return convert(n/100)+" Hundred"+(n%100!=0?" "+convert(n%100):"");
        }
        if(n<1000000){
            return convert(n/1000)+" Thousand"+(n%1000!=0?" "+convert(n%1000):"");
        }
        if(n<1000000000){
            return convert(n/1000000)+" Million"+(n%1000000!=0?" "+convert(n%1000000):"");
        }
        
            return convert(n/1000000000)+" Billion"+(n%1000000000!=0?" "+convert(n%1000000000):"");
        
        
    }
}