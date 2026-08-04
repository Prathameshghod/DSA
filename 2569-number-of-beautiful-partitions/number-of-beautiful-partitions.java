class Solution {
    private static final int MOD = 1_000_000_007;
    public int beautifulPartitions(String s, int k, int minLength) {
        int n=s.length();

        if (!prime(s.charAt(0)) || prime(s.charAt(s.length() - 1))) {
            return 0;
        }
        boolean[] isCut = new boolean[n + 1];
        isCut[0] = true;
        isCut[n] = true;
        for (int i = 1; i < n; i++) {
            if (!prime(s.charAt(i - 1)) && prime(s.charAt(i))) {
                isCut[i] = true;
            }
        }
        long[][] t=new long[k+1][n+1];
        t[0][0]=1;
        
        for(int i=1;i<k+1;i++){
            long r=0;
            for(int j=minLength*i;j<n+1;j++){
                int prevcut=j-minLength;
                if(isCut[prevcut]){
                    r=(r+t[i-1][prevcut])%MOD;
                }
                if(isCut[j]){
                    t[i][j]=r;
                }
            }
        }

        return (int) t[k][n];
    }
    public boolean prime(char c){
        return c=='2'||c=='5'||c=='3'||c=='7';
    }
}