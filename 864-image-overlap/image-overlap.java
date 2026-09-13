class Solution {
    public int solve(int[][] a,int[][] b,int r,int c){
        int n=a.length;
        int ans=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int bi=i+r;
                int bj=j+c;
                if(bi>=n || bi<0 || bj>=n || bj<0){
                    continue;
                }
                if(a[i][j]==1 && b[bi][bj]==1){
                    ans++;
                }
            }
        }
        return ans;
    }
    public int largestOverlap(int[][] img1, int[][] img2) {
        int n=img2.length;
        int m=0;
        for(int r=1-n;r<n;r++){
            for(int c=1-n;c<n;c++){
                m=Math.max(m,solve(img1,img2,r,c));
            }
        }
        return m;
    }
}