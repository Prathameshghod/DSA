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
    public void check(TreeNode root,List<Integer> a){
        if(root==null){
            return;
        }
        
        check(root.left,a);
        a.add(root.val);
        check(root.right,a);
    }
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> a= new ArrayList<>();
        check(root,a);
        
        return a.get(k-1);
    }
}