class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> a= new HashSet<>();
        int n= nums.length;
        for(int i=0;i<n;i++){
             
            for (int j=i+1;j<n;j++){
               Set<Long> c= new HashSet<>();
                for (int k=j+1;k<n;k++){
                    
                    long b=nums[i]+nums[j];
                    b+=nums[k];
                    long e= target-b;
                    if(c.contains(e)){
                        List<Integer> d= new ArrayList<>();
                        d.add(nums[i]);
                        d.add(nums[j]);
                        d.add(nums[k]);
                        d.add((int) e);
                        d.sort(null);
                        a.add(d);
                    }
                    c.add((long) nums[k]);
                }
            }
        }
        List<List<Integer>> r= new ArrayList<>(a);
        return r;
    }
}






class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> a= new HashSet<>();
        int n= nums.length;
        Arrays.sort(nums);
        for (int i=0;i<n-3;i++){
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            
            for (int j=i+1;j<n-2;j++){
                if(j>i+1 && nums[j]==nums[j-1]){
                continue;
            }
                int k=j+1,x=n-1;
                while(k<x){
                    long c=(long) nums[i]+nums[j]+nums[k]+nums[x];
                    if(c>target){
                        x--;
                    }
                    else if(c<target){
                        k++;
                    }
                    else{
                        a.add(Arrays.asList(nums[i], nums[j], nums[k], nums[x]));
                        k++;
                        x--;
                        while (k<x && nums[k]==nums[k-1]) k++;
                        while (k<x && nums[x]==nums[x+1]) x--;
                        
                    }
                }
            }
        }
        List<List<Integer>> r= new ArrayList<>(a);
        return r;
    }
}





class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> a= new HashSet<>();
        int n= nums.length;
        Arrays.sort(nums);
        for (int i=0;i<n-3;i++){
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            
            for (int j=i+1;j<n-2;j++){
                if(j>i+1 && nums[j]==nums[j-1]){
                continue;
            }
                int k=j+1,x=n-1;
                while(k<x){
                    long c=(long) nums[i]+nums[j]+nums[k]+nums[x];
                    if(c>target){
                        x--;
                    }
                    else if(c<target){
                        k++;
                    }
                    else{
                        a.add(Arrays.asList(nums[i], nums[j], nums[k], nums[x]));
                        
                        while (k<x && nums[k]==nums[k+1]) k++;
                        while (k<x && nums[x]==nums[x-1]) x--;
                        k++;
                        x--;
                        
                    }
                }
            }
        }
        List<List<Integer>> r= new ArrayList<>(a);
        return r;
    }
}




class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> a= new HashSet<>();
        int n= nums.length;
        Arrays.sort(nums);
        for (int i=0;i<n-3;i++){
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            
            for (int j=i+1;j<n-2;j++){
                if(j>i+1 && nums[j]==nums[j-1]){
                continue;
            }
            long c = (long) target - (long) nums[i] - (long) nums[j];

                int k=j+1,x=n-1;
                while(k<x){
                    
                    if(nums[k]+nums[x]<c){
                        k++;
                    }
                    else if(nums[k]+nums[x]>c){
                        x--;
                    }
                    else{
                        a.add(Arrays.asList(nums[i], nums[j], nums[k], nums[x]));
                        
                        while (k<x && nums[k]==nums[k+1]) k++;
                        while (k<x && nums[x]==nums[x-1]) x--;
                        k++;
                        x--;
                        
                    }
                }
            }
        }
        List<List<Integer>> r= new ArrayList<>(a);
        return r;
    }
}