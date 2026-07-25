
class Solution {
    int n;
     public boolean ispal(String s,int i,int j){
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)){
               return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public void solve(String s,int idx,List<List<String>> a,List<String> b){
        if(idx==n){
             a.add(new ArrayList<>(b));
             return;
        }
        for(int i=idx;i<n;i++){
            if(ispal(s,idx,i)){
                b.add(s.substring(idx,i+1));
                solve(s,i+1,a,b);
                b.remove(b.size()-1);
            }
        }
    }
    public List<List<String>> partition(String s) {
        n=s.length();
        List<List<String>> a= new ArrayList<>();
        List<String> b= new ArrayList<>();
        
        solve(s,0,a,b);
        return a;
    }
}
