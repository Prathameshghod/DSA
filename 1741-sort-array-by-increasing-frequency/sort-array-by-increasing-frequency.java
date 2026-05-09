import java.util.*;

class Solution {

    public int[] frequencySort(int[] nums) {

        Map<Integer, Integer> a = new HashMap<>();

        // frequency count
        for (int x : nums) {
            a.put(x, a.getOrDefault(x, 0) + 1);
        }

        // store numbers in list
        List<Integer> b = new ArrayList<>();

        for (int x : nums) {
            b.add(x);
        }

        // sort list
        b.sort((x, y) -> {

            // same frequency -> larger number first
            if (a.get(x).equals(a.get(y))) {
                return Integer.compare(y, x);
            }

            // smaller frequency first
            return Integer.compare(a.get(x), a.get(y));
        });

        // copy back to array
        for (int i = 0; i < nums.length; i++) {
            nums[i] = b.get(i);
        }

        return nums;
    }
}