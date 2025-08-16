class Solution {
    public void setZeroes(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        List<int[]> a= new ArrayList<>();
        for(int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                if(matrix[i][j]==0){
                    a.add(new int[]{i,j});
                }
            }
        }
        for (int[] b:a){
            int x=b[0];
            int y=b[1];
            for (int i=0;i<n;i++){
                for (int j=0;j<m;j++){
                    if (i==x){
                        matrix[i][j]=0;
                    }
                    if (j==y){
                        matrix[i][j]=0;
                    }
                }
            }
        }
        return;
    }
}






class Solution {
    public void setZeroes(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        boolean[] r= new boolean[n];
        boolean[] c= new boolean[m];

        for (int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if (matrix[i][j]==0){
                    r[i]=true;
                    c[j]=true;
                }
            }
        }
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                if (r[i] || c[j]){
                    matrix[i][j]=0;
                }
            }
        }
        return;
    }
}






class Solution {
    public void setZeroes(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int x=1;
        int y=1;

        for (int i=0;i<n;i++){
            if (matrix[i][0]==0){
                y=0;
            }
        }
        for (int j=0;j<m;j++){
            if (matrix[0][j]==0){
                x=0;
            }
        }
        for (int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if (matrix[i][j]==0){ 
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }
        for (int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if (matrix[i][0]==0 || matrix[0][j]==0){ 
                    matrix[i][j]=0;
                }
            }
        }
        if(x==0){
            for (int j=0;j<m;j++){
                matrix[0][j]=0;
            }
        }
        if(y==0){
            for (int i=0;i<n;i++){
                matrix[i][0]=0;
            }
        }
        
        return;
    }
}

