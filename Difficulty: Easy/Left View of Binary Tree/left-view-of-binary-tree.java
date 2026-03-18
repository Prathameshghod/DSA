/*
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }
}
*/

class Solution {
    public void left(Node root,int level,List<Integer> r){
        if(root==null){
            return;
        }
        if(r.size()==level){
            r.add(root.data);
        }
        
         if(root.left!=null){
            left(root.left,level+1,r);
        }
        if(root.right!=null){
            left(root.right,level+1,r);
        }

    }
    public ArrayList<Integer> leftView(Node root) {
        // code here
         ArrayList<Integer> r=new ArrayList<>();
        left(root,0,r);
        
        return r;
        
    }
}
