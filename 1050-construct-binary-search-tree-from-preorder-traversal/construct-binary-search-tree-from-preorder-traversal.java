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
    int i=0;
    public TreeNode check(int[] preorder,int min,int max){
        if(i>=preorder.length){
            return null;
        }
        int a=preorder[i];
        if(a<min || a>max){
            return null;
        }
        TreeNode root=new TreeNode(a);
        i++;
        
        root.left=check(preorder,min,a);
        root.right=check(preorder,a,max);

        return root;
    }
    public TreeNode bstFromPreorder(int[] preorder) {
        return check(preorder,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }
}