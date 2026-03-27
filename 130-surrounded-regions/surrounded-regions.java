class Solution {
    public void dfs(char[][] a,int i,int j){
        if(i<0 || i>=a.length || j<0 || j>=a[0].length || a[i][j]!='O'){
            return;
        }
        a[i][j]='U';
        dfs(a,i,j-1);
        dfs(a,i-1,j);
        dfs(a,i,j+1);
        dfs(a,i+1,j);
    }
    public void solve(char[][] board) {
        int r=board.length;
        int c=board[0].length;

        for(int i=0;i<c;i++){
            dfs(board,0,i);

            dfs(board,r-1,i);
        }
        for(int i=1;i<r-1;i++){
            dfs(board,i,0);

            dfs(board,i,c-1);
        }
        convert(board,r,c);
    }
    public void convert(char[][] board,int r,int c){
         for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(board[i][j]=='U'){
                    board[i][j]='O';
                }
                else if(board[i][j]=='O'){
                    board[i][j]='X';
                }
            }
        }
    }
}