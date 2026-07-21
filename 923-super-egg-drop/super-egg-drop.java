class Solution {
    public int superEggDrop(int n, int k) {
        int[][] t= new int[n+1][k+1];
       
        for(int i=1;i<n+1;i++){
            t[i][1]=1;
        }
        for(int j=1;j<k+1;j++){
            t[1][j]=j;
        }
        
        for(int i=2;i<n+1;i++){
            for(int j=2;j<k+1;j++){
                
                int min=Integer.MAX_VALUE;
                
                int l=1;
                int h=j;
                while(l<=h){
                    int x=l+(h-l)/2;
                    
                    int broke=t[i-1][x-1];
                    int not_broke=t[i][j-x];
                    
                    int a=Math.max(broke,not_broke)+1;
                    min = Math.min(min, a);
                    
                    if(broke>not_broke){
                        h=x-1;
                    }
                    else{
                        l=x+1;
                    }
                }
                t[i][j]=min;
            }
        }
        return t[n][k];
    }
}