class Solution {
    public void solve(char[][] board) {
        int r=board.length;
        int c=board[0].length;

        Queue<int[]> q= new LinkedList<>();

        for(int i=0;i<c;i++){
            if(board[0][i]=='O'){
                board[0][i]='U';
                q.add(new int[]{0,i});

            }
            if(board[r-1][i]=='O'){
                board[r-1][i]='U';
                q.add(new int[]{r-1,i});
            }
        }

        for(int i=1;i<r-1;i++){
            if(board[i][0]=='O'){
                board[i][0]='U';
                q.add(new int[]{i,0});
            }
            if(board[i][c-1]=='O'){
                board[i][c-1]='U';
                q.add(new int[]{i,c-1});
            }
        }

        int[] row={0,-1,0,1};
        int[] col={-1,0,1,0};
        while(!q.isEmpty()){
            int[] a=q.poll();
            int ro=a[0];
            int co=a[1];
            for(int i=0;i<4;i++){
                int x=ro+row[i];
                int y=co+col[i];

                if(x>=0 && x<r && y>=0 && y<c && board[x][y]=='O'){
                    board[x][y]='U';
                    q.add(new int[]{x,y});
                }
            }
        }
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