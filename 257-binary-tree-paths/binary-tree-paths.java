/**
 * Definition for a binary tree TreeNode.
 * public class TreeTreeNode {
 *     int val;
 *     TreeTreeNode left;
 *     TreeTreeNode right;
 *     TreeTreeNode() {}
 *     TreeTreeNode(int val) { this.val = val; }
 *     TreeTreeNode(int val, TreeTreeNode left, TreeTreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public void check(TreeNode root,List<String> r,StringBuilder s){
        if(root==null){
            return;
        }
        int n=s.length();
        s.append(root.val);
        if(root.left==null && root.right==null){
            r.add(s.toString());
        }
        s.append("->");
        check(root.left,r,s);
        check(root.right,r,s);
        
        s.setLength(n);
    }
    public List<String> binaryTreePaths(TreeNode root) {
   
        List<String> r=new ArrayList<>();
        
        check(root,r,new StringBuilder());
        return r;
    }
}