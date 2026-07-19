class Solution {
    private boolean ispal(String s, int low, int high,Boolean[][] t) {
        if(t[low][high]!=null){
            return t[low][high];
        }
        while (low < high) {
            if (s.charAt(low++) != s.charAt(high--)) {
                return false;
            }
        }
        return true;
    }
    public void solve(String s,int idx,List<List<String>> a, List<String> b,Boolean[][] t){
        if(idx==s.length()){
            a.add(new ArrayList<>(b));
            return;
        }

        for(int i=idx;i<s.length();i++){
            if(ispal(s,idx,i,t)){
                b.add(s.substring(idx,i+1));
                solve(s,i+1,a,b,t);
                b.remove(b.size()-1);
            }
        }
    }
    public List<List<String>> partition(String s) {
        int n=s.length();
        List<List<String>> a= new ArrayList<>();
        List<String> b= new ArrayList<>();
        Boolean[][] t= new Boolean[n+1][n+1];
        solve(s,0,a,b,t);
        return a;
    }
}