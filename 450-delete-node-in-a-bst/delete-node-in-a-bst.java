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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null){
            return null;
        }
        if(root.val==key){
            return help(root);
        }
        TreeNode curr= root;
        while(curr!=null){
            if(curr.val>key){
                if(curr.left != null && curr.left.val==key){
                    curr.left=help(curr.left);
                    break;
                }
                else{
                    curr=curr.left;
                }
            }
            else{
                if(curr.right!=null && curr.right.val==key){
                    curr.right=help(curr.right);
                    break;
                }
                else{
                    curr=curr.right;
                }
            }
        }
        return root;
    }
    public TreeNode help(TreeNode root){
        if(root.left == null){
            return root.right;
        }
        else if(root.right==null){
            return root.left;
        }
        
            TreeNode rightchild=root.right;
            TreeNode last_right=lastright(root.left);
            last_right.right=rightchild;
            return root.left;
    }
    public TreeNode lastright(TreeNode root){
        if(root.right==null){
            return root;
        }
        return lastright(root.right);
    }
}