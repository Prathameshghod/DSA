class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n=score.length;
        int[] a= score.clone();
        Map<Integer,Integer> b= new HashMap<>();
        for(int i=0;i<n;i++){
            b.put(score[i],i);
        }
        Arrays.sort(a);
        String[] c=new String[n];
        for(int i=n-1;i>=0;i--){
            int d=n-i;
            if(d==1){
                c[b.get(a[i])]="Gold Medal";
            }
            else if(d==2){
                c[b.get(a[i])]="Silver Medal";
            }
            else if(d==3){
                c[b.get(a[i])]="Bronze Medal";
            }
            else{
                c[b.get(a[i])]=String.valueOf(d);
            }
        }
        return c;
    }
}