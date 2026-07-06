class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> a= new HashSet<>();
        for(int i:nums1){
            a.add(i);
        }
        Set<Integer> b= new HashSet<>();
        for(int i:nums2){
            if(a.contains(i)){
                b.add(i);
            }
        }
        int[] c=new int[b.size()];
        int j=0;
        for(int i:b){
            c[j++]=i;
        }
        return c;
    }
}