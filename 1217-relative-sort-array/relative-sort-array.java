class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int n=arr1.length;
        Map<Integer,Integer> m= new HashMap<>();
        for(int i=0;i<n;i++){
            m.put(arr1[i],m.getOrDefault(arr1[i],0)+1);
        }
        int idx=0;
        for(int i:arr2){
            int f=m.get(i);
            while(f-->0){
                arr1[idx++]=i;
            }
            m.remove(i);
        }
        

        List<Integer> rem = new ArrayList<>();

        for (int key : m.keySet()) {

            int f = m.get(key);

            while (f-- > 0) {
                rem.add(key);
            }
        }

        Collections.sort(rem);

        for (int num : rem) {
            arr1[idx++] = num;
        }
        return arr1;
    }
}