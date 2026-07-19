class Solution {
    public int minCut(String s) {
        int n=s.length();
        boolean[][] p=new boolean[n][n];
        int[] t= new int[n];

        for(int i=0;i<n;i++){
            p[i][i]=true;
        }

        for(int l=2;l<=n;l++){
            for (int i = 0; i <= n - l; i++) {
                int j = i + l - 1;
                if(l==2){
                    p[i][j]=(s.charAt(i)==s.charAt(j));
                }
                else{
                    p[i][j]=(s.charAt(i)==s.charAt(j) && p[i+1][j-1]);
                }
            }
        }
        for(int i=0;i<n;i++){
        if(p[0][i]){
                t[i]=0;
            }
            else{
                t[i]=Integer.MAX_VALUE;
                for(int k=0;k<i;k++){
                    if(p[k+1][i]==true && 1+t[k]<t[i]){
                        t[i]=1+t[k];
                    }
                }
            }
        }
        return t[n-1];
    }
}