/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    int a=Integer.MIN_VALUE;
    int solve(TreeNode root){
        if(root==null){
            return 0;
        }
        int l=Math.max(0,solve(root.left));
        int r=Math.max(0,solve(root.right));
        
        int b=root.val+l+r;
        a=Math.max(b,a);
        return root.val+Math.max(l,r);
    }
    public int maxPathSum(TreeNode root) {
        solve(root);
        return a;
    }
}