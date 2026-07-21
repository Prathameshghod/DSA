class Solution {
    public Map<String,Boolean> m= new HashMap<>();
     public boolean anagram(String a,String b){
        int[] c= new int[26];
        for(char i:a.toCharArray()){
            c[i-'a']++;
        }
        for(char i:b.toCharArray()){
            c[i-'a']--;
        }
        for(int i=0;i<26;i++){
            if(c[i]!=0){
                return false;
            }
        }
        return true;
    }
    public boolean solve(String a,String b){
        int n=a.length();
        if(n!=b.length()){
            return false;
        }
        if(n==0){
            return false;
        }
        if(a.equals(b)){
            return true;
        }
        if(!anagram(a,b)){
            return false;
        }
        String c=a+","+b;
        if(m.containsKey(c)){
            return m.get(c);
        }
        boolean flag=false;
        for(int k=1;k<n;k++){
            if(solve(a.substring(0,k),b.substring(0,k)) && solve(a.substring(k),b.substring(k))){
                flag=true;
                break;
            }
            if(solve(a.substring(0,k),b.substring(n-k)) && solve(a.substring(k),b.substring(0,n-k))){
                flag=true;
                break;
            }
        }
        m.put(c,flag);
        return flag;
    }
    public boolean isScramble(String s1, String s2) {
        m.clear();
        return solve(s1,s2);
    }
}