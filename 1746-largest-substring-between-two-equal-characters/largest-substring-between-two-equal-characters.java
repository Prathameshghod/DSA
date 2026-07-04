class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int n=s.length();
        int max=-1;
        Map<Character,Integer> a= new HashMap<>();
        for(int j=0;j<n;j++){
            char i=s.charAt(j);
            if(a.containsKey(i)){
                max=Math.max(j-a.get(i)-1,max);
            }
            else{
                a.put(i,j);
            }
        }
        return max;
    }
}