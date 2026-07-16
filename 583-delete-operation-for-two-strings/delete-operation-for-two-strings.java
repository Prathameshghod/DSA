class Solution {
    public int minDistance(String word1, String word2) {
        int n=word1.length();
        int m=word2.length();
        int[][] t= new int[n+1][m+1];
        for(int i=0;i<n+1;i++){
            for(int j=0;j<m+1;j++){
                if(i==0 || j==0){
                    t[i][j]=0;
                }
            }
        }
        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                if(word1.charAt(i-1)==word2.charAt(j-1)){
                    t[i][j]=1+t[i-1][j-1];
                }
                else{
                    t[i][j]=Math.max(t[i-1][j],t[i][j-1]);
                }
            }
        }
        StringBuilder s= new StringBuilder();
        int i=n;
        int j=m;
        while(i>0 && j>0){
            if(word1.charAt(i-1)==word2.charAt(j-1)){
                s.append(word1.charAt(i-1));
                i--;
                j--;
            }
            else if(t[i-1][j]>t[i][j-1]){
                s.append(word1.charAt(i-1));
                i--;
            }
            else{
                s.append(word2.charAt(j-1));
                j--;
            }
        }
        while (i > 0) {
            s.append(word1.charAt(i - 1));
            i--;
        }
        
        while (j > 0) {
            s.append(word2.charAt(j - 1));
            j--;
        }
        
        return s.length()-t[n][m];
    }
}