class Solution {        
    public List<Integer> largestDivisibleSubset(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int[] t = new int[n];
        int[] hash = new int[n];

        Arrays.fill(t, 1);

        int maxi = 1;
        int last = 0;

        List<Integer> a = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            hash[i] = i;

            for (int j = 0; j < i; j++) {

                if (((nums[i] % nums[j])==0 || (nums[j] % nums[i])==0) && t[i] < t[j] + 1) {

                    t[i] = t[j] + 1;
                    hash[i] = j;
                }
            }

            if (t[i] > maxi) {
                maxi = t[i];
                last = i;
            }
        }

        int curr = last;

        while (hash[curr] != curr) {
            a.add(nums[curr]);
            curr = hash[curr];
        }

        a.add(nums[curr]);

        Collections.reverse(a);

        return a;
    }
}