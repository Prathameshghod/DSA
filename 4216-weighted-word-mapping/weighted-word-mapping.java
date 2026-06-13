class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        int n=words.length;
        StringBuilder s= new StringBuilder();
        for(int i=0;i<n;i++){
            int c=0;
            for(int j=0;j<words[i].length();j++){
                c+=weights[words[i].charAt(j)-'a'];
            }
            int a=c%26;
            char b=(char) ('a'+25-a);
            s.append(b);
        }
        return s.toString();
    }
}