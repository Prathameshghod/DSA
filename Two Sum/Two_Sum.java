// Brute Force Solution
// Time Complexity: O(n^2)
// Space Complexity: O(1)

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        int[] a=new int[2];
        for(int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                if (nums[i]+nums[j]==target){
                    a[0]=i;
                    a[1]=j;
                    return a;
                }
            }
        }
        return a;
    }
}

// Optimized Solution using HashMap
// Time Complexity: O(n)    
// Space Complexity: O(n)

    class Solution {
        public int[] twoSum(int[] nums, int target) {
            int n=nums.length;
            int[] b= new int[2];
            Map<Integer,Integer> a= new HashMap<>();
            for (int i=0;i<n;i++){
                int c=target-nums[i];
                if (a.containsKey(c)){
                    b[0]=a.get(c);
                    b[1]=i;
                    return b;
                }
                else{
                    a.put(nums[i],i);
                }
            }
            return b;
        }
    }