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
    public int lheight(TreeNode root){
        int depth=0;
        while(root!=null){
            root=root.left;
            depth++;
        }
        return depth;
    }
    public int rheight(TreeNode root){
        int depth=0;
        while(root!=null){
            root=root.right;
            depth++;
        }
        return depth;
    }

    public int countNodes(TreeNode root) {
        int l=lheight(root);
        int r=rheight(root);

        if(l==r){
            return (int) Math.pow(2,r)-1;
        }
        return 1+countNodes(root.left)+countNodes(root.right);
    }
}