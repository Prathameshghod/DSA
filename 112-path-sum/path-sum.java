class Solution {
    public boolean check(TreeNode root, int t, int c) {
        if (root == null) return false;

        c+=root.val;

        if (root.left == null && root.right == null) {
            return c==t;
        }

        return check(root.left, t, c) || check(root.right, t, c);

    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
       
        return check(root,targetSum,0);
    }
}