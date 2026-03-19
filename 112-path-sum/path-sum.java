class Solution {
    public void check(TreeNode root, List<List<Integer>> r, List<Integer> a) {
        if (root == null) return;

        a.add(root.val);

        if (root.left == null && root.right == null) {
            r.add(new ArrayList<>(a)); // copy list
        }

        check(root.left, r, a);
        check(root.right, r, a);

        a.remove(a.size() - 1); // correct backtracking
    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        List<List<Integer>> r = new ArrayList<>();
        List<Integer> a = new ArrayList<>();

        check(root, r, a);

        for (List<Integer> i : r) {
            int c = 0;
            for (int j : i) {
                c += j;
            }
            if (c == targetSum) return true;
        }
        return false;
    }
}