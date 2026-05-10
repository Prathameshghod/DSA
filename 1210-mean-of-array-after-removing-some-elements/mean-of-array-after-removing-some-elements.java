class Solution {
    public double trimMean(int[] arr) {
        int n=arr.length;
        int b=n/20;
        TreeMap<Integer,Integer> t= new TreeMap<>();
        for(int i=0;i<n;i++){
           t.put(arr[i],t.getOrDefault(arr[i],0)+1);
        }
        int k=b;
        System.out.println(t);
        int c=0;
        for(int i:arr){
            c+=i;
        }
        while(k>0){
            int a=t.firstKey();
            int x=t.get(a);
            int d=Math.min(k,x);
            c-=(d*a);
            if(d==x){
                t.remove(a);
            }
            else{
                t.put(a,x-d);
            }
            k-=d;
        }
        k=b;
        while(k>0){
            int a=t.lastKey();
            int x=t.get(a);
            int d=Math.min(k,x);
            c-=(d*a);
            if(d==x){
                t.remove(a);
            }
            else{
                t.put(a,x-d);
            }
            k-=d;
        }
        return (double)c/(n-2*b);
    }
}