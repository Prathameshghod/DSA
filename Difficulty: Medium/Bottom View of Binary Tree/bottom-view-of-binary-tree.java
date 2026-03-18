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
class Pair{
    Node node;
    int level;
    
    Pair(Node node,int level){
        this.node=node;
        this.level=level;
    }
    
}
class Solution {
    public ArrayList<Integer> bottomView(Node root) {
        // code here
        ArrayList<Integer> r= new ArrayList<>();
        
        TreeMap<Integer,Integer> m= new TreeMap<>();
        
        Queue<Pair> q= new LinkedList<>();
        
        
        q.add(new Pair(root,0));
        
        while(!q.isEmpty()){
            Pair p= q.poll();
            Node n=p.node;
            int i=p.level;
            
            
            m.put(i,n.data);
        
            
            if(n.left !=null){
                q.add(new Pair(n.left,i-1));
            }
            if(n.right !=null){
                q.add(new Pair(n.right,i+1));
            }
        }
        for(int i:m.values()){
            r.add(i);
        }
        return r;
    }
}