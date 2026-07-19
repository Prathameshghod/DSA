class Solution {
    private boolean ispal(String s, int low, int high) {
        while (low < high) {
            if (s.charAt(low++) != s.charAt(high--)) {
                return false;
            }
        }
        return true;
    }
    public void solve(String s,int idx,List<List<String>> a, List<String> b){
        if(idx==s.length()){
            a.add(new ArrayList<>(b));
            return;
        }

        for(int i=idx;i<s.length();i++){
            if(ispal(s,idx,i)){
                b.add(s.substring(idx,i+1));
                solve(s,i+1,a,b);
                b.remove(b.size()-1);
            }
        }
    }
    public List<List<String>> partition(String s) {
        List<List<String>> a= new ArrayList<>();
        List<String> b= new ArrayList<>();
        solve(s,0,a,b);
        return a;
    }
}