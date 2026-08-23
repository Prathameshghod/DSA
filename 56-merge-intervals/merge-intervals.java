class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) {
            return intervals;
        }
        Arrays.sort(intervals,(a,b) -> Integer.compare(a[0],b[0]));

        List<int[]> a= new ArrayList<>();
    
        int[] curr=intervals[0];
        a.add(curr);

        for(int[] i:intervals){
            int e=curr[1];
            int b=i[0];
            int c=i[1];

            if(e>=b){
                curr[1]=Math.max(e,c);
            }
            else{
                curr=i;
                a.add(curr);
            }
        }
        return a.toArray(new int[a.size()][]);
    }
}