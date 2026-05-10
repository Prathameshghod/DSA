class Solution {
    public double trimMean(int[] arr) {
        int n=arr.length;
        int b=(5*n)/100;
        int c=n-b-b;
        int d=0;
        Arrays.sort(arr);
        for(int i=b;i<n-b;i++){
            d+=arr[i];
        }
        // System.out.println(n);
        // for(int i=0;i<n;i++){
        //     System.out.print(arr[i]+" ");
        // }
        // System.out.println("sdded");
        // for(int i=b;i<n-b;i++){
        //     System.out.print(arr[i]+" ");
        // }
        // System.out.println(d);
        // System.out.println(c);
        double e=(double) d/c;
        return e;
    }
}