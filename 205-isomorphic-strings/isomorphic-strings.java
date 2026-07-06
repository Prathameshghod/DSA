class Solution {
    public boolean isIsomorphic(String s, String t) {
        int n=s.length();
        Map<Character,Character> a= new HashMap<>();
        for(int i=0;i<n;i++){
            if(a.containsKey(s.charAt(i))){
                if(a.get(s.charAt(i))!=t.charAt(i)){
                    return false;
                }
            }
            else{
                if(a.containsValue(t.charAt(i))){
                    return false;
                }
            }
            a.put(s.charAt(i),t.charAt(i));
        }
    
        return true;
    }
}