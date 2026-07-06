class Solution {
    public int[][] merge(int[][] intervals) {
        int n=intervals.length;
        if(n<=1){
            return intervals;
        }
        Arrays.sort(intervals, (a, b) -> a[0] == b[0] ? b[1]-a[1] :a[0]-b[0]);
        
        List<int[]> a=new ArrayList<>();
        int s=intervals[0][0];
        int r=intervals[0][1];
        for(int i=1;i<n;i++){
            if(intervals[i][0]<=r){
                r=Math.max(r,intervals[i][1]);
            }
            else{
                a.add(new int[]{s,r});
                s=intervals[i][0];
                r=intervals[i][1];
            }
        }
        a.add(new int[]{s,r});
        return a.toArray(new int[a.size()][2]);
    }
}