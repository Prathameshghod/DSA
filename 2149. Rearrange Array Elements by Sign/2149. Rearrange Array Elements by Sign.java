class Solution {
    public int[] rearrangeArray(int[] nums) {
        int y=nums.length;
        int l=y/2;
        List<Integer> p=new ArrayList<>();
        List<Integer> n= new ArrayList<>();
        for (int i:nums){
            if(i>0){
                p.add(i);
            }
            else{
                n.add(i);
            }
        }

        int[] a= new int[y];
        int j=0;
        for (int i=0;i<l;i++){
            a[j++]=p.get(i);
            a[j++]=n.get(i);
        }
        return a;
    }
}




class Solution {
    public int[] rearrangeArray(int[] nums) {
        int y=nums.length;
        int[] a= new int[y];
        int p=0;
        int n=1;
        for (int i=0;i<y;i++){
            if (nums[i]>0){
                a[p]=nums[i];
                p+=2;
            }
            else{
                a[n]=nums[i];
                n+=2;
            }
        }
        return a;
    }
}