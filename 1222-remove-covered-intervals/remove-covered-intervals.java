class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] == b[0] ? b[1]-a[1] :a[0]-b[0]);
        int n=intervals.length;
        int i=0;
        int j=1;
        int c=n;
        int a=0;
        while(j<n){
            if(intervals[i][1]>=intervals[j][1]){
                c--;
            }
            else{
                i=j;
            }
            j++;
        }
        return c;
    }
}