/*
class Node {
    int data;
    Node left, right;

    public Node(int d) {
        data = d;
        left = right = null;
    }
}
*/

class Solution {
    public boolean isleaf(Node root){
        if(root.right==null && root.left==null){
            return true;
        }
        return false;
    }
    public void leftboundary(Node root,ArrayList<Integer> r){
        
        Node b=root.left;
        while(b!=null){
            if(!isleaf(b)){
                r.add(b.data);
            }
            if(b.left!=null){
                b=b.left;
            }
            else{
                b=b.right;
            }
        }
    }
    
    public void rightboundary(Node root,ArrayList<Integer> r){
         List<Integer> a= new ArrayList<>();
        Node b=root.right;
        while(b!=null){
            if(!isleaf(b)){
                a.add(b.data);
            }
            if(b.right!=null){
                b=b.right;
            }
            else{
                b=b.left;
            }
        }
        int n=a.size();
        for(int i=n-1;i>=0;i--){
            r.add(a.get(i));
        }
        
    }
    
    public void bottomboundary(Node root,ArrayList<Integer> r){
       
        
        if(isleaf(root)){
            r.add(root.data);
        }
        if(root.left!=null){
            bottomboundary(root.left,r);
        }
        if(root.right!=null){
            bottomboundary(root.right,r);
        }
        
    }
    ArrayList<Integer> boundaryTraversal(Node root) {
        // code here
        ArrayList<Integer> r= new ArrayList<>();
        if(root==null){
            return r;
        }
        if(!isleaf(root)){
            r.add(root.data);
        }
        leftboundary(root,r);
        bottomboundary(root,r);
        rightboundary(root,r);
        return r;
    }
}