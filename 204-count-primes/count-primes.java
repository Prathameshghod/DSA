class Solution {
    public int countPrimes(int n) {
        if(n==0 || n==1){
            return 0;
        }
        boolean[] a= new boolean[n+1];
        Arrays.fill(a,true);
        a[0]=a[1]=false;
        
        for(int i=2;i*i<n;i++){
            if(a[i]){
                for(int j=i*i;j<n;j+=i){
                a[j]=false;
            }
        }   
        }
        int c=0;
        for(int i=0;i<n;i++){
            if(a[i]){
                c++;
            }
        }
        return c;

    }
}