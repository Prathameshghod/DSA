class Solution {
    public int solve(int i,int j,int[] a,Integer[][] t){
        if(j-i<2){
            return 0;
        }
        if(t[i][j]!=null){
            return t[i][j];
        }
        int min=Integer.MAX_VALUE;
        for(int k=i+1;k<j;k++){
            int c=(a[j]-a[i])+solve(i,k,a,t)+solve(k,j,a,t);
            min=Math.min(c,min);
        }
        return t[i][j]=min;
    }
    public int minCost(int n, int[] cuts) {
        int nn=cuts.length;
        int[] a= new int[nn+2];
       for (int i = 0; i < nn; i++) {
            a[i] = cuts[i];
        }
        a[nn] = 0;
        a[nn + 1] = n;
        Arrays.sort(a);
        int m=a.length;
        Integer[][] t= new Integer[m+1][m+1];

        return solve(0,a.length-1,a,t);
    }
}