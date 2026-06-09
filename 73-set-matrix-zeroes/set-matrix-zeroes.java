class Solution {
    public void setZeroes(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        List<int[]> a= new ArrayList<>();

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==0){
                    a.add(new int[]{i,j});
                }
            }
        }
        for(int[] b:a){
            int x=b[0];
            int y=b[1];

            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    if(i==x){
                        matrix[i][j]=0;
                    }
                    if(j==y){
                        matrix[i][j]=0;
                    }
                }
            }
        }
        
    }
}