class Solution {
    public int solve(int[] a,int x,int i){
        if(i==a.length){
            return x;
        }
        int c=solve(a,x^a[i],i+1);
        int b=solve(a,x,i+1);
        return c+b;
    }
    public int subsetXORSum(int[] nums) {
        return solve(nums,0,0);
    }
}