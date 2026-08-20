class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        Map<Integer, Set<Integer>> a = new HashMap<>();

        for (int[] i : reservedSeats) {
            int r = i[0];
            int c = i[1];

            a.putIfAbsent(r, new HashSet<>());
            a.get(r).add(c);
        }

        int c = (n - a.size()) * 2;

        for (int r : a.keySet()) {
            Set<Integer> s = a.get(r);

            boolean l = !s.contains(2) && !s.contains(3)
                    && !s.contains(4) && !s.contains(5);

            boolean m = !s.contains(4) && !s.contains(5)
                    && !s.contains(6) && !s.contains(7);

            boolean h = !s.contains(6) && !s.contains(7)
                    && !s.contains(8) && !s.contains(9);

            if (l && h) {
                c += 2;
            } else if (l || m || h) {
                c += 1;
            }
        }

        return c;
    }
}