class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] a=arr.clone();
        Arrays.sort(a);
        int n=a.length;
        Map<Integer,Integer> b= new HashMap<>();
        int c=1;
        for(int i=0;i<n;i++){
            if(b.get(a[i])==null){
                b.put(a[i],c);
                c++;
            }
        }
        for(int i=0;i<n;i++){
            arr[i]=b.get(arr[i]);
        }
        return arr;
    }
}