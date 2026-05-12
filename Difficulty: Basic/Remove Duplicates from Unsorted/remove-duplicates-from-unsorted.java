class Solution {
    static ArrayList<Integer> removeDuplicate(int arr[]) {
        // code here
        HashSet<Integer> s = new HashSet<>();
        ArrayList<Integer> v = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
         
            if (!s.contains(arr[i])) {
                s.add(arr[i]);
                v.add(arr[i]);
            }
        }
        return v;
    }
}