/*

Definition for Binary Tree Node
class Node
{
    int data;
    Node left;
    Node right;

    Node(int data)
    {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Solution {
     public static void check(Node root, ArrayList<Integer> a, ArrayList<ArrayList<Integer>> r){
        
        if(root == null) return;
        
        a.add(root.data);
        
        if(root.left == null && root.right == null){
            r.add(new ArrayList<>(a));
        }
        
        check(root.left, a, r);
        check(root.right, a, r);
        
        a.remove(a.size() - 1);
    }
    public static ArrayList<ArrayList<Integer>> Paths(Node root) {
        // code here
        ArrayList<ArrayList<Integer>> r = new ArrayList<>();
        ArrayList<Integer> a = new ArrayList<>();
        
        check(root, a, r);
        
        return r;
    }
}