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
        ArrayList<Integer> a= new ArrayList<>();
        check(root,a);

        int n=a.size();

        Map<Integer,Integer> m= new HashMap<>();

        for(int i=0;i<n;i++){
            int c=k-a.get(i);
            if(m.containsKey(c)){
                return true;
            }
            m.put(a.get(i),i);
        }
        return false;
    }
}