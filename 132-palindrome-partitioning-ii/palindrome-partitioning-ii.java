class Solution {

    public boolean ispal(String s,int i,int j){
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public int solve(String s,int i,int[] t){

        if(i==s.length()){
            return 0;
        }
        if (ispal(s, i, s.length() - 1)) {
            return 0;
        }
        if(t[i]!=-1){
            return t[i];
        }

        int min=Integer.MAX_VALUE;

        for(int k=i;k<s.length();k++){
            if(ispal(s,i,k)){
                int nextCuts = solve(s, k + 1, t);
                if (nextCuts != Integer.MAX_VALUE) {
                    min = Math.min(min, 1 + nextCuts);
                }
            }
        }

        return t[i]=min;
    }

    public int minCut(String s) {

        int n=s.length();

        int[] t=new int[n+1];

            Arrays.fill(t,-1);
        

        return solve(s,0,t);
    }
}