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
    public List<Integer> rightSideView(TreeNode root) {
        List<List<Integer>> a= new ArrayList<>();
        Queue<TreeNode> q= new LinkedList<>();

        List<Integer> r=new ArrayList<>();
        if(root==null){
            return r;
        }
        q.add(root);

        while(!q.isEmpty()){
            List<Integer> b=new ArrayList<>();
            int n=q.size();
            for(int i=0;i<n;i++){
                TreeNode c=q.poll();
                b.add(c.val);

                if(c.left!=null){
                    q.add(c.left);
                }
                if(c.right!=null){
                    q.add(c.right);
                }
            }
            a.add(b);
        }
        for(List<Integer> i:a){
            r.add(i.get(i.size()-1));
        }
        return r;
    }
}