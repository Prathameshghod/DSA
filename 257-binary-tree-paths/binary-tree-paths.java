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
     public static void check(TreeNode root, String path, ArrayList<String> r){
        
        if(root == null) return;
        
        // build path
        if(path.length() == 0){
            path = "" + root.val;
        } else {
            path = path + "->" + root.val;
        }
        
        // leaf TreeNode
        if(root.left == null && root.right == null){
            r.add(path);
            return;
        }
        
        check(root.left, path, r);
        check(root.right, path, r);
    }
    public List<String> binaryTreePaths(TreeNode root) {
         ArrayList<String> r = new ArrayList<>();
        check(root, "", r);
        
        return r;
    }
}