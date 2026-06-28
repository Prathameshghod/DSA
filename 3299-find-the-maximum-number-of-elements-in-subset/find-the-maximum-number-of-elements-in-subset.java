class Solution {
    public int maximumLength(int[] nums) {
        int n=nums.length;
        Map<Integer,Integer> a=new HashMap<>();
        for(int i:nums){
            a.put(i,a.getOrDefault(i,0)+1);
        }
        int max=0;
    
        for(int i:nums){
            int r=0;
            long x=i;
            if(x==1){
                if(a.get(1)%2==0){
                    max=Math.max(a.get(1)-1,max);
                }
                else{
                    max=Math.max(max,a.get(1));
                }
                continue;
            }
            while(a.containsKey((int) x)){
                if(a.get((int) x)==1){
                    r++;
                    break;
                }
                long b=x*x;
                if(a.containsKey((int) b)){
                    r+=2;
                    x=b;
                }
                else{
                    r++;
                    break;
                }
            }
            
            max=Math.max(max,r);
        }
        return max;
    }
}
