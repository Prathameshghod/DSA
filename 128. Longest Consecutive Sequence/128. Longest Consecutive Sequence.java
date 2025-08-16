class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        Set<Integer> a= new TreeSet<>();
        for(int i=0;i<n;i++){
            a.add(nums[i]);
        }
        if(n==0){
            return 0;
        }
        List<Integer> b= new ArrayList<>();
        for (int i:a){
            b.add(i);
        }
        
        int c=1;
        int d=1;
        for (int i=0;i<b.size()-1;i++){
            if(b.get(i+1)-b.get(i)==1){
                c++;
                d=Math.max(d,c);
            }
            else{
                c=1;
            }
        }
        return d;
    }
}




class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        Set<Integer> a= new HashSet<>();
        for(int i=0;i<n;i++){
            a.add(nums[i]);
        }
        if(n==0){
            return 0;
        }
        List<Integer> b= new ArrayList<>();
        for (int i:a){
            b.add(i);
        }
        Collections.sort(b);
        int c=1;
        int d=1;
        for (int i=0;i<b.size()-1;i++){
            if(b.get(i+1)-b.get(i)==1){
                c++;
                d=Math.max(d,c);
            }
            else{
                c=1;
            }
        }
        return d;
    }
}




class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        Set<Integer> a= new HashSet<>();
        for(int i:nums){
            a.add(i);
        }
        int r=0;
        for (int i:a){
            if(!a.contains(i-1)){
                int b=i;
                int c=1;
                while(a.contains(b+1)){
                    b++;
                    c++;
                }
                r=Math.max(r,c);
            }
        }
        return r;
    }
}




class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        
        Arrays.sort(nums);
        int max = 1;
        int currentLen = 1;
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                continue; // skip duplicates
            }
            if (nums[i] - nums[i - 1] == 1) {
                currentLen++;
            } else {
                max = Math.max(max, currentLen);
                currentLen = 1;
            }
        }
        
        max = Math.max(max, currentLen);
        return max;
    }
}