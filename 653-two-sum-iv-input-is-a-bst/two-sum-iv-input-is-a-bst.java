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
    public boolean findTarget(TreeNode root, int k) {
        ArrayList<Integer> ans= new ArrayList<>();
        check(root,ans);
        int li = 0;
        int ri = ans.size() - 1;
        while(li<ri){
            int left = ans.get(li);
            int right  = ans.get(ri);
            if(left + right < k){
                li++;
            }else if(left + right > k){
                ri--;
            }else{
                return true;
            }
        }
        return false;
    }
}