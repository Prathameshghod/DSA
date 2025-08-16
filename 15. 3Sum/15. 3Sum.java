    class Solution {
        public List<List<Integer>> threeSum(int[] nums) {
            int n=nums.length;
            Set<List<Integer>> a = new HashSet<>();
            Arrays.sort(nums);
            for (int i=0;i<n-2;i++){
                if(i>0 && nums[i]==nums[i-1]){
                    continue;
                }

                
                int j=i+1,k=n-1;
                while(j<k){
                    int b=nums[i]+nums[j]+nums[k];
                    if(b>0){
                        k--;
                    }

                    else if(b<0){
                        j++;
                    }

                    else {
                        a.add(Arrays.asList(nums[i],nums[j],nums[k]));
                        j++;
                        k--;
                        while(j<k && nums[j]==nums[j-1]){
                            j++;
                        }
                        while(j<k && nums[k]==nums[k+1]){
                            k--;
                        }
                    
                    }

                }
            }
            List<List<Integer>> r = new ArrayList<>(a);
            return r;
        }
    }




        class Solution {
        public List<List<Integer>> threeSum(int[] nums) {
            int n=nums.length;
            Set<List<Integer>> a = new HashSet<>();
            Arrays.sort(nums);
            for (int i=0;i<n-2;i++){
                if(i>0 && nums[i]==nums[i-1]){
                    continue;
                }

                
                int j=i+1,k=n-1;
                while(j<k){
                    int b=nums[i]+nums[j]+nums[k];
                    if(b>0){
                        k--;
                    }

                    else if(b<0){
                        j++;
                    }

                    else {
                        a.add(Arrays.asList(nums[i],nums[j],nums[k]));
                        j++;
                        k--;
                        while(j<k && nums[j]==nums[j-1]){
                            j++;
                        }
                        while(j<k && nums[k]==nums[k+1]){
                            k--;
                        }
                    
                    }

                }
            }
            List<List<Integer>> r = new ArrayList<>(a);
            return r;
        }
    }