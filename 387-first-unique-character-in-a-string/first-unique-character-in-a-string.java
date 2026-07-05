class Solution {
    public int firstUniqChar(String s) {
        int[] a= new int[26];
        int n=s.length();
        for(char i:s.toCharArray()){
            a[i-'a']++;
        }
        for(int i=0;i<n;i++){
            char b=s.charAt(i);
            if(a[b-'a']==1){
                return i;
            }
        }
        return -1;
    }
}