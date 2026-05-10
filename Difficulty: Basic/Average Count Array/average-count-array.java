// User function Template for Java

class Solution {

    // Function for finding maximum and value pair
    public ArrayList<Integer> countArray(int[] arr, int x) {
        // Complete the function
        int n=arr.length;
        // Map<Integer,Integer> a= new HashMap<>();
        // for(int i=0;i<n;i++){
        //     a.put(arr[i],a.getOrDefault(arr[i],0)+1);
        // }
        int m=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>m){
                m=arr[i];
            }
        }
        int[] a= new int[m+1];
        for(int i=0;i<n;i++){
            a[arr[i]]++;
        }
        ArrayList<Integer> c=new ArrayList<>();
        for(int i=0;i<n;i++){
            int b=((arr[i]+x)/2);
            c.add(a[b]);
        }
        return c;
    }
}
