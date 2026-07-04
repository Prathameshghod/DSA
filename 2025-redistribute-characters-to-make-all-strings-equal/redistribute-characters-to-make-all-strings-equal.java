class Solution {
    public boolean makeEqual(String[] words) {
        int n=words.length;
        Map<Character,Integer> a= new HashMap<>();

        for(String i:words){
            for(char j:i.toCharArray()){
                a.put(j,a.getOrDefault(j,0)+1);
            }
        }
        for(Map.Entry<Character,Integer> b:a.entrySet()){
            if(b.getValue()%n!=0){
                return false;
            }
        }
        return true;
    }
}