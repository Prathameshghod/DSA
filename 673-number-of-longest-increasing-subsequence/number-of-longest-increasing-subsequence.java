class Solution {
    public int findNumberOfLIS(int[] nums) {
        int n=nums.length;
        int[] t= new int[n];
        int[] c=new int[n];
        Arrays.fill(t,1);
        Arrays.fill(c,1);
        int max=1;
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(nums[j]<nums[i]){
                    if(t[i]==t[j]+1){
                        c[i]+=c[j];
                    }
                    else if(t[i]<t[j]+1){
                        t[i]=t[j]+1;
                        c[i]=c[j];
                    }
                }
            }
        }
        for(int i=0;i<n;i++){
            max=Math.max(t[i],max);
        }
        int a=0;
        for(int i=0;i<n;i++){
            if(t[i]==max){
                a+=c[i];
            }
        }
        return a;
    }
}