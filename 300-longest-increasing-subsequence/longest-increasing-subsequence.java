    class Solution {
        public int solve(int[] a,int i,int prev,int[][] t){
            if(i==a.length){
                return 0;
            }
            if(prev!=-1 && t[i][prev]!=-1){
                return t[i][prev];
            }
            int b=0;
            if(prev==-1 || a[i]>a[prev]){
                b=1+solve(a,i+1,i,t);
            }
            int c=solve(a,i+1,prev,t);

            if(prev!=-1){
                t[i][prev]=Math.max(b,c);
            }
            return Math.max(b,c);
            
        }
        public int lengthOfLIS(int[] nums) {
            int n=nums.length;
            int[][] t= new int[n+1][n+1];
            for(int[] i:t){
                Arrays.fill(i,-1);
            }
            return solve(nums,0,-1,t);
        }
    }