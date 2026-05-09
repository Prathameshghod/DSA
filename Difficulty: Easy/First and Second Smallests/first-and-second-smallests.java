import java.util.*;

class Solution {
    public ArrayList<Integer> minAnd2ndMin(int[] arr) {
        
        int n = arr.length;

        Set<Integer> s = new HashSet<>();

        for (int i = 0; i < n; i++) {
            s.add(arr[i]);
        }

        int[] temp = new int[s.size()];
        int index = 0;

        for (int num : s) {
            temp[index++] = num;
        }

        Arrays.sort(temp);

        ArrayList<Integer> a = new ArrayList<>();

        if (temp.length < 2) {
            a.add(-1);
        } else {
            a.add(temp[0]);
            a.add(temp[1]);
        }

        return a;
    }
}