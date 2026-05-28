class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        char[] a= s.toCharArray();
        long b=0;
        for(int i=shifts.length-1;i>=0;i--){
            b=(b+shifts[i])%26;
            a[i]=(char)(((a[i]-'a'+b)%26)+'a');
        }
        return new String(a);
    }
}