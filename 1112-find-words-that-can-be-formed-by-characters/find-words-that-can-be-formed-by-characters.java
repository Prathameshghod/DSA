class Solution {
    public int countCharacters(String[] words, String chars) {
        int n=words.length;
        int[] a= new int[26];
        for(char i:chars.toCharArray()){
            a[i-'a']++;
        }
        int r=0;
        for(String i:words){
            boolean c=true;
            int[] b= new int[26];
            for(char j:i.toCharArray()){
                b[j-'a']++;
            }
            for(int j=0;j<26;j++){
                if(a[j]<b[j]){
                    c=false;
                    break;
                }
            }
            if(c){
                r+=i.length();
            }
        }
        return r;   
    }
}