class Solution {
    public String destCity(List<List<String>> paths) {
        Set<String> a= new HashSet<>();
        int n=paths.size();
        
        for(List<String> i:paths){
            String b= i.get(0);
            a.add(b);
        }
        for(List<String> i:paths){
            
            String c= i.get(1);
            if(!a.contains(c)){
                return c;
            }
        }
        return " ";
    }
}