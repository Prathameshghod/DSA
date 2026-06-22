class Solution {
    public int longestPalindrome(String s) {

        Map<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int ans = 0;
        boolean odd = false;

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {

            int freq = entry.getValue();

            if (freq % 2 == 0) {
                ans += freq;
            } else {
                ans += freq - 1;
                odd = true;
            }
        }

        if (odd)
            ans++;

        return ans;
    }
}