class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int n=g.length;
        int m=s.length;
        int c=0;
        int i=n-1;
        int j=m-1;
        while(i>=0 && j>=0){
            if(g[i]<=s[j]){
                c++;
                i--;
                j--;
            }
            else{
                i--;
            }
        }
        return c;
    }
}