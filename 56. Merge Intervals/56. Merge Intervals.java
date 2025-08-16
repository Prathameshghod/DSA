class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        List<int[]> a= new ArrayList<>();
        int n=intervals.length;
        if(n==1){
            return intervals;
        }
        int[] b=intervals[0];
        a.add(b);
        for(int[] i:intervals){
            if(i[0]<=b[1]){
                b[1]=Math.max(b[1],i[1]);
            }
            else{
                b=i;
                a.add(i);
            }
        }
        return a.toArray(new int[a.size()][]);
    }
}