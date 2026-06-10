class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid.length;
        int[] a=new int[(n*n)+1];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[grid[i][j]]++;
            }
        }
        int[] b=new int[2];
        for(int i=1;i<=n*n;i++){
            if(a[i]==0){
                b[1]=i;
            }
            else if(a[i]==2){
                b[0]=i;
            }
        }
        return b;
    }
}