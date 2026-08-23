class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        ArrayList<int[]> a= new ArrayList<>();
        int i=0;
        int n=intervals.length;
        while(i<n && intervals[i][1]<newInterval[0]){
            a.add(intervals[i]);
            i++;
        }
        
        int l=newInterval[0];
        int r=newInterval[1];

        while(i<n && intervals[i][0]<=r){
             l=Math.min(intervals[i][0],l);
             r=Math.max(intervals[i][1],r);
            i++;
        }
        a.add(new int[]{l,r});

        while(i<n){
            a.add(intervals[i]);
            i++;
        }
        
        return a.toArray(new int[a.size()][]);
    }
}