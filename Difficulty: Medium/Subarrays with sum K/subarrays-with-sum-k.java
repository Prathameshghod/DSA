class Solution {
    public int cntSubarrays(int[] arr, int k) {
        int n=arr.length;
        
        Map<Integer,Integer> b = new HashMap<>();
        b.put(0,1);
        int c=0;
        int d=0;
        for (int i=0;i<n;i++){
            d+=arr[i];
            int a=d-k;
            if (b.containsKey(a)){
                c+=b.get(a);
                b.put(d,b.getOrDefault(d,0)+1);
                
            }
            else{
                b.put(d,b.getOrDefault(d,0)+1);
            }
            
        }
        return c;
        
    }
}