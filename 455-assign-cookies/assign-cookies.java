class Solution {
    public int findContentChildren(int[] g, int[] s) {
         Arrays.sort(g);
         Arrays.sort(s);
         int n=s.length;
        int m=g.length;
        int i=n-1;
        int j=m-1;
        int c=0;
        while(i>=0 && j>=0){
            if(s[i]>=g[j]){
                c++;
                i--;
            }
            j--;
        }
        return c;
    }
}