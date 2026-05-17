class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] a=arr.clone();
        Arrays.sort(a);
        int n=arr.length;
        Map<Integer,Integer> m= new HashMap<>();
        int r=1;
        for(int i=0;i<n;i++){
            if(!m.containsKey(a[i])){
                m.put(a[i],r);
                r++;
            }
        }
        for(int i=0;i<n;i++){
            arr[i]=m.get(arr[i]);
        }
        return arr;
    }
}