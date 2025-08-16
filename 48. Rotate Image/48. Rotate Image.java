class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
    
        int[][] a= new int[n][n];
        int b=n-1;
        for (int i=0;i<n;i++){
            
            for (int j=0;j<n;j++){
                a[j][b]=matrix[i][j];
                
            }
            b--;
        }
        for (int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=a[i][j];
            }
        }
        return;
    }
}




class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) { 
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        int c=n/2;
        for(int i=0;i<n;i++){
            int b=n-1;
            for (int j=0;j<c;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][b];
                matrix[i][b] = temp;
                b--;
            }
        }
        return;
    }
}