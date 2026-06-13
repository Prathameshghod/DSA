class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        Map<Character,Integer> a= new HashMap<>();
        int max=0;
        int l=0;

        for(int i=0;i<n;i++){
            a.put(s.charAt(i),a.getOrDefault(s.charAt(i),0)+1);

            while(a.get(s.charAt(i))>1){
                a.put(s.charAt(l),a.get(s.charAt(l))-1);
                if(a.get(s.charAt(l))==0){
                    a.remove(s.charAt(l));
                }
                l++;
            }

            if(a.get(s.charAt(i))==1){
                max=Math.max(max,i-l+1);
            }
        }
        return max;
    }
}