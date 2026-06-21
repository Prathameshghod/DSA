class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int n=costs.length;
        int a=0;
        for(int i=0;i<n;i++){
            a=Math.max(a,costs[i]);
        }
        int[] b=new int[a+1];
        for(int i=0;i<n;i++){
            b[costs[i]]++;
        }
        int j=0;
        for(int i=0;i<=a;i++){
            while(b[i]>0){
                costs[j]=i;
                j++;
                b[i]--;
            }
        }
        int c=0;
        for(int i=0;i<n;i++){
            if(costs[i]>coins){
                return c;
            }
            coins-=costs[i];
            c++;
        }
        return c;
    }
}