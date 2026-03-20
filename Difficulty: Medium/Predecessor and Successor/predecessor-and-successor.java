/*
class Node {
    int data;
    Node left, right;
    Node(int x) {
        data = x;
        left = right = null;
    }
}
*/

class Solution {
    public ArrayList<Node> findPreSuc(Node root, int key) {
        // code here
        Node floor=null;
        Node ceil=null;
        
        Node curr=root;
        
        while(curr!=null){
            
            if(curr.data<key){
                floor=curr;
                curr=curr.right;
            }
            else{
                curr=curr.left;
            }
        }
         curr=root;
         
         while(curr!=null){
            
            if(curr.data>key){
                ceil=curr;
                curr=curr.left;
            }
            else{
                curr=curr.right;
            }
        }
        ArrayList<Node> a=new ArrayList<>();
        a.add(floor);
        a.add(ceil);
        return a;
    }
}