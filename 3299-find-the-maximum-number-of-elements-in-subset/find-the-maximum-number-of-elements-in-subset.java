class Solution {
    public int maximumLength(int[] nums) {
        int n=nums.length;
        Map<Integer,Integer> a=new HashMap<>();
        for(int i:nums){
            a.put(i,a.getOrDefault(i,0)+1);
        }
        int max=0;
        int ones = a.getOrDefault(1, 0);
max = (ones % 2 == 0) ? ones - 1 : ones;

for (int i : nums) {

    if (i == 1) continue;

    int r = 0;
    long x = i;

    while (x <= Integer.MAX_VALUE &&
           a.getOrDefault((int)x, 0) > 1) {

        r += 2;
        x *= x;
    }

    if (x <= Integer.MAX_VALUE &&
        a.getOrDefault((int)x, 0) == 1) {
        r++;
    } else {
        r--;
    }

    max = Math.max(max, r);
}
return max;
    }
}
