class Solution {
    public String destCity(List<List<String>> paths) {
        Map<String,Integer> a= new HashMap<>();
        int n=paths.size();
        
        for(List<String> i:paths){
            String b= i.get(0);
            a.put(b,a.getOrDefault(b,0)+1);
        }
        for(List<String> i:paths){
            
            String c= i.get(1);
            if(a.getOrDefault(c,0)!=1){
                return c;
            }
        }
        return " ";
    }
}