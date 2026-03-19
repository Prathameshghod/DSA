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
    public int widthOfBinaryTree(TreeNode root) {
     
       Queue<Pair<TreeNode,Integer>> q=new LinkedList<>();
        int width=Integer.MIN_VALUE;

        q.add(new Pair<>(root,0));

        while(!q.isEmpty()){
            int n=q.size();
            int l=0;
            int r=0;
            for(int i=0;i<n;i++){
                Pair<TreeNode,Integer> p=q.poll();
                TreeNode a=p.getKey();
                Integer b=p.getValue();
                if(i==0){
                    l=b;
                }
                if(i==n-1){
                    r=b;
                }
                 if(a.left !=null){
                    q.add(new Pair<>(a.left,b*2+1));
                }
                if(a.right !=null){
                    q.add(new Pair<>(a.right,b*2+2));
                }
            }
            width=Math.max(width,r-l+1);
        }
        return width;
    }
}