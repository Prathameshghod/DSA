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
    public void right(TreeNode root,int level,List<Integer> r){
        if(root==null){
            return;
        }
        if(r.size()==level){
            r.add(root.val);
        }
        if(root.right!=null){
            right(root.right,level+1,r);
        }
         if(root.left!=null){
            right(root.left,level+1,r);
        }

    }
    public List<Integer> rightSideView(TreeNode root) {

        List<Integer> r=new ArrayList<>();
        right(root,0,r);
        
        return r;
    }
}