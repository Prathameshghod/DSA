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
    public void check(TreeNode root,LinkedList<Integer> a){
        if(root==null){
            return;
        }
        a.add(root.val);
        check(root.left,a);
        check(root.right,a);
    }
    public void flatten(TreeNode root) {
        LinkedList<Integer> a= new LinkedList<>();
        check(root,a);
        TreeNode curr=root;
        if(root==null){
            return;
        }
        curr.val=a.removeFirst();

        while(!a.isEmpty()){
            curr.left=null;
            curr.right=new TreeNode(a.removeFirst());
            curr=curr.right;
        }

    }
}