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
    TreeNode prev;
    TreeNode first;
    TreeNode second;

    public void recoverTree(TreeNode root) {
        help(root);
        int temp=first.val;
        first.val=second.val;
        second.val=temp;
    }
    public void help(TreeNode root){
        if(root==null){
            return;
        }
        help(root.left);

        if(prev!=null && prev.val>root.val){
            if(first==null){
                 first=prev;
            }
            second=root;
            
        }

        prev=root;

        help(root.right);
    }
}