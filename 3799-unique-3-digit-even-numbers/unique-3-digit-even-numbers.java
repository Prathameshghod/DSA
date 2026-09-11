class Solution {
    public void solve(int[] d,int c,int b,boolean[] vis,Set<Integer> a){
        if(c==3){
            if(b%2==0){
                a.add(b);
            }
            return;
        }
        for(int i=0;i<d.length;i++){
            if(vis[i]==true){
                continue;
            }
            if(c==0 && d[i]==0){
                continue;
            }
            vis[i]=true;
            solve(d,c+1,b*10+d[i],vis,a);
            vis[i]=false;
        }
    }
    public int totalNumbers(int[] digits) {
        int n=digits.length;
        boolean[] vis=new boolean[n];
        Set<Integer> a= new HashSet<>();

         solve(digits,0,0,vis,a);
         return a.size();
    }
}