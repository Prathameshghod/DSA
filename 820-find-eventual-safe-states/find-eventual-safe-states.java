class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n = graph.length;

        Set<Integer> s = new HashSet<>();
        List<Integer> r = new ArrayList<>();

        // Step 1: terminal nodes
        for (int i = 0; i < n; i++) {
            if (graph[i].length == 0) {
                s.add(i);
                r.add(i);
            }
        }

        boolean changed = true;

        // Step 2: repeat until no new nodes are added
        while (changed) {
            changed = false;

            for (int i = 0; i < n; i++) {
                if (s.contains(i)) continue;

                boolean a = true;

                for (int j : graph[i]) {
                    if (!s.contains(j)) {
                        a = false;
                        break;
                    }
                }

                if (a) {
                    s.add(i);
                    r.add(i);
                    changed = true; // 🔥 important
                }
            }
        }

        Collections.sort(r);
        return r;
    }
}