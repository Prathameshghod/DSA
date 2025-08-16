class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n= nums.length;
        int a=(int) Math.floor(n/3);
        Map<Integer,Integer> b= new HashMap<>();
        List<Integer> d= new ArrayList<>();

        for (int i:nums){
            b.put(i,b.getOrDefault(i,0)+1);
        }        
        for (Map.Entry<Integer, Integer> c : b.entrySet()){
            if(c.getValue()>a){
                d.add(c.getKey());
            }
        }
        return d;
    }
}