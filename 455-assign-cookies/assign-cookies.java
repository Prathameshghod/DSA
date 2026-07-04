class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int n=g.length;
        int m=s.length;
        int i=n-1;
        int j=m-1;
        int c=0;
        Arrays.sort(g);
        Arrays.sort(s);
        while(i>=0 && j>=0){
            if(s[j]>=g[i]){
                c++;
                j--;
            }
            i--;
        }
        return c;
    }
}