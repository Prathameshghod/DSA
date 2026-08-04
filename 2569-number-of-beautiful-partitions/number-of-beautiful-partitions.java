class Solution {
    private static final int MOD = 1_000_000_007;
    public int beautifulPartitions(String s, int k, int minLength) {
        int n=s.length();
        if (!prime(s.charAt(0)) || prime(s.charAt(s.length() - 1))) {
            return 0;
        }
        int[][] t=new int[k+1][n+1];
        for(int[] i:t){
            Arrays.fill(i,-1);
        }
        return solve(s,k,minLength,0,t);
    }
    public int solve(String s, int k, int len,int idx,int[][] t){
        int n=s.length();
        if(k==0){
            return idx==n?1:0;
        }
        if(n-idx<k*len){
            return 0;
        }
        if(t[k][idx]!=-1){
            return t[k][idx];
        }
        long r=0;
        for(int i=idx+len-1;i<n;i++){
            if(!prime(s.charAt(i))){
                int next=i+1;
                
                if(next==n || prime(s.charAt(next))){
                    r=(r+solve(s,k-1,len,next,t))%MOD;
                }
            }
        }
        return t[k][idx]=(int)r;
    }
    public boolean prime(char c){
        return c=='2'||c=='5'||c=='3'||c=='7';
    }
}